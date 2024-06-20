package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.UsuarioEmpleadoFacadeImp;
import com.entidades.ecommerce.domain.dto.usuarioEmpleado.UsuarioEmpleadoFullDto;
import com.entidades.ecommerce.domain.entities.UsuarioEmpleado;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarioEmpleado")
@CrossOrigin("*")
public class UsuarioEmpleadoController extends BaseControllerImp<UsuarioEmpleado, UsuarioEmpleadoFullDto, Long, UsuarioEmpleadoFacadeImp> {
    public UsuarioEmpleadoController(UsuarioEmpleadoFacadeImp facade) {super(facade); }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioEmpleadoFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEmpleadoFullDto>> getAll() {
        return super.getAll();
    }

    @PostMapping()
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<UsuarioEmpleadoFullDto> create(@RequestBody UsuarioEmpleadoFullDto entity){
        return super.create(entity);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<UsuarioEmpleadoFullDto> edit(@RequestBody UsuarioEmpleadoFullDto entity, @PathVariable Long id){
        return super.edit(entity, id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'SUPERADMIN')")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return super.deleteById(id);
    }

}