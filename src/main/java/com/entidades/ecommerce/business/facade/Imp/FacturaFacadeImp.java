package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.FacturaFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.business.service.FacturaService;
import com.entidades.ecommerce.domain.dto.factura.FacturaFullDto;
import com.entidades.ecommerce.domain.entities.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImp extends BaseFacadeImp<Factura, FacturaFullDto, Long> implements FacturaFacade {

    @Autowired
    private FacturaService facturaService;


    public FacturaFacadeImp(BaseService<Factura, Long> baseService, BaseMapper<Factura, FacturaFullDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Override
    public Factura crearFactura(Long pedidoId) {
        return facturaService.crearFactura(pedidoId);
    }

}
