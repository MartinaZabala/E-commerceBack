package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.usuarioEmpleado.UsuarioEmpleadoFullDto;
import com.entidades.ecommerce.domain.entities.UsuarioEmpleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioEmpleadoMapper extends BaseMapper<UsuarioEmpleado, UsuarioEmpleadoFullDto>{
}
