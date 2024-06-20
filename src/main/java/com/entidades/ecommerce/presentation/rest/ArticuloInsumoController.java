package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.ArticuloInsumoFacade;
import com.entidades.ecommerce.business.facade.Imp.ArticuloInsumoFacadeImp;
import com.entidades.ecommerce.business.service.ArticuloInsumoService;
import com.entidades.ecommerce.domain.dto.articuloInsumo.ArticuloInsumoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloInsumo;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import com.entidades.ecommerce.repositories.ArticuloInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articuloInsumo")
@CrossOrigin("*")
public class ArticuloInsumoController extends BaseControllerImp<ArticuloInsumo, ArticuloInsumoFullDto, Long, ArticuloInsumoFacadeImp> {
    public ArticuloInsumoController(ArticuloInsumoFacadeImp facade) { super(facade); }

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    @Autowired
    private ArticuloInsumoService articuloInsumoService;
    @Autowired
    private ArticuloInsumoFacade articuloInsumoFacade;
    @GetMapping("/elaborar/{idSucursal}")
    public ResponseEntity<List<ArticuloInsumoFullDto>> insumosParaElaborar(@PathVariable Long idSucursal) {
        List<ArticuloInsumoFullDto> insumos = articuloInsumoFacade.insumosParaElaborar(idSucursal);
        if (insumos != null && !insumos.isEmpty()) {
            return ResponseEntity.ok(insumos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping("/sucursal/{idSucursal}")
    public ResponseEntity<List<ArticuloInsumoFullDto>> insumos(@PathVariable Long idSucursal) {
        List<ArticuloInsumoFullDto> insumos = articuloInsumoFacade.insumos(idSucursal);
        if (insumos != null && !insumos.isEmpty()) {
            return ResponseEntity.ok(insumos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticuloInsumoFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<ArticuloInsumoFullDto>> getAll() {
        return super.getAll();
    }

    @PostMapping()
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<ArticuloInsumoFullDto> create(@RequestBody ArticuloInsumoFullDto entity){
        return super.create(entity);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<ArticuloInsumoFullDto> edit(@RequestBody ArticuloInsumoFullDto entity, @PathVariable Long id){
        return super.edit(entity, id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return super.deleteById(id);
    }

    @GetMapping("/descontarStock/{id}/{cantidad}")
    public ResponseEntity<Number> descontarStock(
            @PathVariable("id") Long idArticulo,
            @PathVariable("cantidad") Integer cantidad) {
        try {
            // Buscar el artículo insumo por su ID
            Optional<ArticuloInsumo> optionalArticuloInsumo = articuloInsumoRepository.findById(idArticulo);

            // Verificar si se encontró el artículo insumo
            if (optionalArticuloInsumo.isPresent()) {
                ArticuloInsumo articuloInsumo = optionalArticuloInsumo.get();
                // Llama al método del servicio para descontar el stock
                return articuloInsumoService.descontarStock(articuloInsumo, cantidad);
            } else {
                // Devuelve un mensaje si el artículo insumo no se encontró
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(-1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(-1); // Respuesta HTTP 500 si ocurre un error inesperado
        }
    }
    // Método POST para subir imágenes
    @PostMapping("/uploads")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<String> uploadImages(
            @RequestParam(value = "uploads", required = true) MultipartFile[] files,
            @RequestParam(value = "id", required = true) Long idArticulo) {
        try {
            return facade.uploadImages(files, idArticulo); // Llama al método del servicio para subir imágenes
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Manejo básico de errores, se puede mejorar para devolver una respuesta más específica
        }
    }

    // Método POST para eliminar imágenes por su publicId y Long
    @PostMapping("/deleteImg")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<String> deleteById(
            @RequestParam(value = "publicId", required = true) String publicId,
            @RequestParam(value = "id", required = true) Long id) {
        try {
            return facade.deleteImage(publicId, id); // Llama al método del servicio para eliminar la imagen
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Invalid UUID format"); // Respuesta HTTP 400 si el UUID no es válido
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("An error occurred"); // Respuesta HTTP 500 si ocurre un error inesperado
        }
    }

    // Método GET para obtener todas las imágenes almacenadas
    @GetMapping("/getAllImagesByInsumoId/{id}")
    public ResponseEntity<?> getAll(@PathVariable Long id) {
        try {
            return facade.getAllImagesByInsumoId(id); // Llama al método del servicio para obtener todas las imágenes
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Manejo básico de errores, se puede mejorar para devolver una respuesta más específica
        }
    }
}
