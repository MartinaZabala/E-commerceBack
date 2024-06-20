package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.entities.Factura;

public interface FacturaService extends BaseService<Factura, Long> {

    Factura crearFactura(Long pedidoId);
}
