package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.localidad.LocalidadFullDto;
import com.entidades.ecommerce.domain.entities.Localidad;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocalidadMapper extends BaseMapper<Localidad, LocalidadFullDto> {
}
