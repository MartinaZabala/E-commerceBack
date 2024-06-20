package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.service.Imp.MercadoPagoService;
import com.entidades.ecommerce.domain.dto.pedido.PedidoFullDto;
import com.entidades.ecommerce.domain.entities.PreferenceMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mercado_pago")
public class MercadoPagoController {

    @Autowired
    private MercadoPagoService mercadoPagoService;

    @PostMapping("/create_preference")
    public PreferenceMP getPreferenciaIdMercadoPago(@RequestBody PedidoFullDto pedido) {
        return mercadoPagoService.createPreference(pedido);
    }
}
