package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.cliente.ClienteFullDto;
import com.entidades.ecommerce.domain.entities.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ClienteMapper extends BaseMapper<Cliente, ClienteFullDto>{
}
