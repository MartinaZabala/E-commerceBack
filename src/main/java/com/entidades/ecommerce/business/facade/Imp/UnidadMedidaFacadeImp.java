package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.UnidadMedidaFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.unidadMedida.UnidadMedidaFullDto;
import com.entidades.ecommerce.domain.entities.UnidadMedida;
import org.springframework.stereotype.Service;


@Service
public class UnidadMedidaFacadeImp extends BaseFacadeImp<UnidadMedida, UnidadMedidaFullDto,Long> implements UnidadMedidaFacade {
    public UnidadMedidaFacadeImp(BaseService<UnidadMedida, Long> baseService, BaseMapper<UnidadMedida, UnidadMedidaFullDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
