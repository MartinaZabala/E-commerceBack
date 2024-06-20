package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.provincia.ProvinciaFullDto;

import java.util.List;

public interface ProvinciaFacade extends BaseFacade<ProvinciaFullDto, Long> {
    List<ProvinciaFullDto> findByPaisId(Long id);
}
