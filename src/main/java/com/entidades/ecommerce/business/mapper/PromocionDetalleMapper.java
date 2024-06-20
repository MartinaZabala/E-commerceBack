package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.promocionDetalle.PromocionDetalleFullDto;
import com.entidades.ecommerce.domain.entities.PromocionDetalle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface PromocionDetalleMapper extends BaseMapper<PromocionDetalle, PromocionDetalleFullDto>{
}
