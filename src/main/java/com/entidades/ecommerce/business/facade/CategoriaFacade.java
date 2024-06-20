package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;

import java.util.List;

public interface CategoriaFacade extends BaseFacade<CategoriaCreateDto, Long> {
    List<CategoriaCreateDto> categoriaSucursal(Long idSucursal);

}
