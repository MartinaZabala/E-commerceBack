package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.factura.FacturaFullDto;
import com.entidades.ecommerce.domain.entities.Factura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacturaMapper extends BaseMapper<Factura, FacturaFullDto>{
}
