package com.entidades.ecommerce.repositories;


import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.ArticuloInsumo;
import com.entidades.ecommerce.domain.entities.ArticuloManufacturado;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Repository
public interface ArticuloRepository  extends BaseRepository<Articulo, Long> {

    @Query("SELECT ai FROM ArticuloInsumo ai WHERE ai.esParaElaborar = false AND ai.eliminado = false")
    Page<ArticuloInsumo> findInsumos(Pageable pageable);

    @Query("SELECT am FROM ArticuloManufacturado am WHERE am.eliminado = false")
    Page<ArticuloManufacturado> findManufacturados(Pageable pageable);

    @Query("SELECT ai FROM ArticuloInsumo ai WHERE ai.esParaElaborar = false AND ai.eliminado = false AND ai.categoria = :categoria")
    Page<ArticuloInsumo> findInsumosByCategoria(Pageable pageable, Categoria categoria);

    @Query("SELECT am FROM ArticuloManufacturado am WHERE am.eliminado = false AND am.categoria = :categoria")
    Page<ArticuloManufacturado> findManufacturadosByCategoria(Pageable pageable, Categoria categoria);

}
