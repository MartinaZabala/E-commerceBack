package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
import com.entidades.ecommerce.domain.entities.Categoria;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long> {
    List<CategoriaCreateDto> categoriaSucursal(Long idSucursal);

}
