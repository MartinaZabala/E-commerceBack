package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.entities.Usuario;

public interface UsuarioService extends BaseService<Usuario, Long> {

    Usuario obtenerUsuarioPorEmail(String email);

}
