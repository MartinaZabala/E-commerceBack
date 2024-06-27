package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria,Long>{
    @Query("SELECT c FROM Categoria c JOIN c.sucursales s WHERE s.id = :idSucursal AND c.eliminado = false")
    List<Categoria> categoriaSucursal(@Param("idSucursal") Long idSucursal);
    @Query("SELECT c FROM Categoria c WHERE c.id != 2 AND c.eliminado = false")
    List<Categoria> categorias();
}
