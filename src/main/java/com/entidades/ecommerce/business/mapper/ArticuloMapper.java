package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.business.service.CategoriaService;
import com.entidades.ecommerce.domain.dto.articulo.ArticuloDto;
import com.entidades.ecommerce.domain.entities.Articulo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategoriaService.class, CategoriaMapper.class})
public interface ArticuloMapper extends BaseMapper<Articulo, ArticuloDto>{
    @Override
    Articulo toEntity(ArticuloDto source);
}