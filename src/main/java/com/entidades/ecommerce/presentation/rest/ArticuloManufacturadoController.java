package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.ArticuloManufacturadoFacade;
import com.entidades.ecommerce.business.facade.Imp.ArticuloManufacturadoFacadeImp;
import com.entidades.ecommerce.domain.dto.articuloManufacturado.ArticuloManufacturadoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloManufacturado;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/articuloManufacturado")
@CrossOrigin("*")
public class ArticuloManufacturadoController  extends BaseControllerImp<ArticuloManufacturado, ArticuloManufacturadoFullDto, Long, ArticuloManufacturadoFacadeImp> {
    public ArticuloManufacturadoController(ArticuloManufacturadoFacadeImp facade) {
        super(facade);
    }
    @Autowired
    private ArticuloManufacturadoFacade articuloManufacturadoFacade;
    @GetMapping("/sucursal/{idSucursal}")
    public ResponseEntity<List<ArticuloManufacturadoFullDto>> manufacturados(@PathVariable Long idSucursal) {
        List<ArticuloManufacturadoFullDto> manufacturados = articuloManufacturadoFacade.manufacturados(idSucursal);
        if (manufacturados != null && !manufacturados.isEmpty()) {
            return ResponseEntity.ok(manufacturados);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<ArticuloManufacturadoFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<ArticuloManufacturadoFullDto>> getAll() {
        return super.getAll();
    }


}
