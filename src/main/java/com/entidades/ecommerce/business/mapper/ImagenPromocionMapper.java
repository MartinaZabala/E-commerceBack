package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.entities.ImagenPromocion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ImagenPromocionMapper  extends BaseMapper<ImagenPromocion, ImagenDto> {
}
