package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Usuario;

import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long> {

    Usuario findFirstByEmail(String email);

}
