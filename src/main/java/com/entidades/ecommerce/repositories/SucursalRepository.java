package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Sucursal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SucursalRepository extends BaseRepository<Sucursal,Long> {
    @Query("SELECT s FROM Sucursal s LEFT JOIN FETCH s.promociones WHERE s.id = :id")
    Sucursal findWithPromocionesById(@Param("id") Long id);
    @Query("SELECT p FROM Sucursal p WHERE p.empresa.id = :idEmpresa AND p.eliminado = false")
    List<Sucursal> sucursalEmpresa(@Param("idEmpresa") Long idEmpresa);
}
