package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.PromocionDetalleFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.promocionDetalle.PromocionDetalleFullDto;
import com.entidades.ecommerce.domain.entities.PromocionDetalle;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleFacadeImp extends BaseFacadeImp<PromocionDetalle, PromocionDetalleFullDto, Long> implements PromocionDetalleFacade {
    public PromocionDetalleFacadeImp(BaseService<PromocionDetalle, Long> baseService, BaseMapper<PromocionDetalle, PromocionDetalleFullDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
