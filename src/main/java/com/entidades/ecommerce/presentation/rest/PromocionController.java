package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.Imp.PromocionFacadeImp;
import com.entidades.ecommerce.business.facade.PromocionFacade;
import com.entidades.ecommerce.domain.dto.promocion.PromocionFullDto;
import com.entidades.ecommerce.domain.entities.Promocion;
import com.entidades.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/promocion")
@CrossOrigin("*")
public class PromocionController extends BaseControllerImp<Promocion, PromocionFullDto, Long, PromocionFacadeImp> {

    public PromocionController(PromocionFacadeImp facade) {super (facade); }
    @Autowired
    private PromocionFacade promocionFacade;
    @GetMapping("/sucursal/{idSucursal}")
    public ResponseEntity<List<PromocionFullDto>> promocionSucursal(@PathVariable Long idSucursal) {
        List<PromocionFullDto> promociones = promocionFacade.promocionSucursal(idSucursal);
        if (promociones != null && !promociones.isEmpty()) {
            return ResponseEntity.ok(promociones);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<PromocionFullDto> getById(@PathVariable Long id){
        return super.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<PromocionFullDto>> getAll() {
        return super.getAll();
    }

}
