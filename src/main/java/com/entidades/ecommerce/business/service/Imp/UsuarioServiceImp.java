package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.UsuarioService;
import com.entidades.ecommerce.domain.entities.Usuario;
import com.entidades.ecommerce.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp extends BaseServiceImp<Usuario, Long> implements UsuarioService {

    @Autowired private UsuarioRepository usuarioRepository;

    public Usuario obtenerUsuarioPorEmail(String email) {
        Usuario usuario = this.usuarioRepository.findFirstByEmail(email);

        if(usuario == null) {
            throw new RuntimeException("El usuario no esta registrado para operar");
        }

        return usuario;
    }

}
