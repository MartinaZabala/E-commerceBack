package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.entities.ImagenEmpresa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ImagenEmpresaMapper extends BaseMapper<ImagenEmpresa, ImagenDto> {
}
