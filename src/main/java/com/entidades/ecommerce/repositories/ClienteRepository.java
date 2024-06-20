package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Long> {

    Cliente findByEmail(String email);

}
