package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long> {
}
