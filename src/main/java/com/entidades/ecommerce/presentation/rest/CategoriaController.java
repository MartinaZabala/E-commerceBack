package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.CategoriaFacadeImp;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
import com.entidades.ecommerce.domain.entities.Categoria;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController extends BaseControllerImp<Categoria, CategoriaCreateDto, Long, CategoriaFacadeImp> {

    public CategoriaController(CategoriaFacadeImp facade) {super (facade); }
    @GetMapping("/sucursal/{idSucursal}")
    public List<CategoriaCreateDto> getCategoriasPorSucursal(@PathVariable Long idSucursal) {
        return this.facade.categoriaSucursal(idSucursal);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaCreateDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaCreateDto>> getAll() {
        return super.getAll();
    }
}
