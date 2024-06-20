package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.entities.ImagenArticulo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ImagenArticuloMapper extends BaseMapper<ImagenArticulo, ImagenDto> {
}
