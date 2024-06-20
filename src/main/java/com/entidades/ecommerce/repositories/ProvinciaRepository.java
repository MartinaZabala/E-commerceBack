package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia,Long>{
    Provincia findByNombre(String provinciaNombre);
    List<Provincia> findByPaisId(Long id);
}
