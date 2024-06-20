package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Promocion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromocionRepository extends BaseRepository<Promocion,Long>{

    @Query("SELECT c FROM Promocion c JOIN c.sucursales s WHERE s.id = :idSucursal AND c.eliminado = false")
    List<Promocion> promocionSucursal(@Param("idSucursal") Long idSucursal);
}
