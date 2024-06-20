package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.PaisFacadeImp;
import com.entidades.ecommerce.domain.dto.pais.PaisFullDto;
import com.entidades.ecommerce.domain.entities.Pais;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
@CrossOrigin("*")
public class PaisController extends BaseControllerImp<Pais, PaisFullDto,Long, PaisFacadeImp> {

    public PaisController(PaisFacadeImp facade) {
        super(facade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaisFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<PaisFullDto>> getAll() {
        return super.getAll();
    }

    @PostMapping()
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<PaisFullDto> create(@RequestBody PaisFullDto entity){
        return super.create(entity);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<PaisFullDto> edit(@RequestBody PaisFullDto entity, @PathVariable Long id){
        return super.edit(entity, id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return super.deleteById(id);
    }
}
