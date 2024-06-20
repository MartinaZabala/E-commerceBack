package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.usuarioCliente.UsuarioDto;
import com.entidades.ecommerce.domain.entities.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends BaseMapper<Usuario, UsuarioDto>{
}
