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

}
