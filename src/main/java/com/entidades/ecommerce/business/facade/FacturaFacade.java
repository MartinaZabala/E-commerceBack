package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.factura.FacturaFullDto;
import com.entidades.ecommerce.domain.entities.Factura;

public interface FacturaFacade extends BaseFacade<FacturaFullDto, Long> {

    Factura crearFactura(Long pedidoId);
}
