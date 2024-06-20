package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.usuarioCliente.UsuarioDto;
import com.entidades.ecommerce.domain.entities.Usuario;

public interface UsuarioFacade extends BaseFacade<UsuarioDto, Long> {

    Usuario obtenerUsuarioPorEmail(String email);

}
