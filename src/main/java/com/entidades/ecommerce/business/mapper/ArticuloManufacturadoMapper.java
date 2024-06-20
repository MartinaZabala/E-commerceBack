package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.articuloManufacturado.ArticuloManufacturadoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloManufacturado;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface ArticuloManufacturadoMapper extends BaseMapper<ArticuloManufacturado, ArticuloManufacturadoFullDto> {
    List<ArticuloManufacturadoFullDto> manufacturadosToManufacturadoFullDtos(List<ArticuloManufacturado> manufacturados);

}
