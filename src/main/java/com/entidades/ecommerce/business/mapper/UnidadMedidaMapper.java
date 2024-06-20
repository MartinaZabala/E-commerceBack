package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.unidadMedida.UnidadMedidaFullDto;
import com.entidades.ecommerce.domain.entities.UnidadMedida;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnidadMedidaMapper extends BaseMapper<UnidadMedida, UnidadMedidaFullDto> {
}
