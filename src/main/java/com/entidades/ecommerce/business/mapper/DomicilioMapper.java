package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.domicilio.DomicilioFullDto;
import com.entidades.ecommerce.domain.entities.Domicilio;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = LocalidadMapper.class)
public interface DomicilioMapper extends BaseMapper<Domicilio, DomicilioFullDto> {


}
