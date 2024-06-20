package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.DomicilioFacadeImp;
import com.entidades.ecommerce.domain.dto.domicilio.DomicilioFullDto;
import com.entidades.ecommerce.domain.entities.Domicilio;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domicilio")
@CrossOrigin("*")
public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioFullDto,Long, DomicilioFacadeImp> {
    public DomicilioController(DomicilioFacadeImp facade) {
        super(facade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DomicilioFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<DomicilioFullDto>> getAll() {
        return super.getAll();
    }

    @PostMapping()
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<DomicilioFullDto> create(@RequestBody DomicilioFullDto entity){
        return super.create(entity);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<DomicilioFullDto> edit(@RequestBody DomicilioFullDto entity, @PathVariable Long id){
        return super.edit(entity, id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return super.deleteById(id);
    }
}
