package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.PromocionDetalleFacadeImp;
import com.entidades.ecommerce.domain.dto.promocionDetalle.PromocionDetalleFullDto;
import com.entidades.ecommerce.domain.entities.PromocionDetalle;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promocionDetalle")
@CrossOrigin("*")
public class PromocionDetalleController extends BaseControllerImp<PromocionDetalle, PromocionDetalleFullDto, Long, PromocionDetalleFacadeImp> {

    public PromocionDetalleController(PromocionDetalleFacadeImp facade) {super(facade);}

    @GetMapping("/{id}")
    public ResponseEntity<PromocionDetalleFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<PromocionDetalleFullDto>> getAll() {
        return super.getAll();
    }

    @PostMapping()
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<PromocionDetalleFullDto> create(@RequestBody PromocionDetalleFullDto entity){
        return super.create(entity);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<PromocionDetalleFullDto> edit(@RequestBody PromocionDetalleFullDto entity, @PathVariable Long id){
        return super.edit(entity, id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return super.deleteById(id);
    }

}
