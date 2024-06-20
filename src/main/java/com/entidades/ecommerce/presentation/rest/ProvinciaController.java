package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.ProvinciaFacadeImp;
import com.entidades.ecommerce.domain.dto.provincia.ProvinciaFullDto;
import com.entidades.ecommerce.domain.entities.Provincia;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincia")
@CrossOrigin("*")
public class ProvinciaController extends BaseControllerImp<Provincia, ProvinciaFullDto,Long, ProvinciaFacadeImp>  {
    public ProvinciaController(ProvinciaFacadeImp facade) {
        super(facade);
    }

    private static final Logger logger = LoggerFactory.getLogger(ProvinciaController.class);

    @GetMapping("findByPais/{idPais}")
    public ResponseEntity<List<ProvinciaFullDto>> getByProvincia(@PathVariable Long idPais) {
        logger.info("INICIO GET BY PROVINCIA");
        return ResponseEntity.ok(facade.findByPaisId(idPais));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProvinciaFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<ProvinciaFullDto>> getAll() {
        return super.getAll();
    }

    @PostMapping()
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<ProvinciaFullDto> create(@RequestBody ProvinciaFullDto entity){
        return super.create(entity);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<ProvinciaFullDto> edit(@RequestBody ProvinciaFullDto entity, @PathVariable Long id){
        return super.edit(entity, id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return super.deleteById(id);
    }
}
