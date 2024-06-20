package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.localidad.LocalidadFullDto;

import java.util.List;

public interface LocalidadFacade extends BaseFacade<LocalidadFullDto, Long> {

    List<LocalidadFullDto> findByProvinciaId(Long id);
}
