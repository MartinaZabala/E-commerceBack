package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.articuloInsumo.ArticuloInsumoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloInsumo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel =  "spring", uses = LocalidadMapper.class)
public interface ArticuloInsumoMapper extends BaseMapper<ArticuloInsumo, ArticuloInsumoFullDto> {
    List<ArticuloInsumoFullDto> insumosToInsumoFullDtos(List<ArticuloInsumo> insumos);

}
