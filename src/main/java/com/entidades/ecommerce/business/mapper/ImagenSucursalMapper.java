package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.entities.ImagenSucursal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImagenSucursalMapper extends BaseMapper<ImagenSucursal, ImagenDto> {
}
