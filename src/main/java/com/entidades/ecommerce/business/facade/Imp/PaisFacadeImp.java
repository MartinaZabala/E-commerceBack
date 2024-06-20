package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.PaisFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.pais.PaisFullDto;
import com.entidades.ecommerce.domain.entities.Pais;
import org.springframework.stereotype.Service;


@Service
public class PaisFacadeImp extends BaseFacadeImp<Pais, PaisFullDto,Long> implements PaisFacade {
    public PaisFacadeImp(BaseService<Pais, Long> baseService, BaseMapper<Pais, PaisFullDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
