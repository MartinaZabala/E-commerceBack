package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.domain.dto.promocion.PromocionFullDto;
import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.Categoria;
import com.entidades.ecommerce.domain.enums.TipoPromocion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EcommerceFacade {

    Page<Articulo> getFilteredArticulosSortedByPrecio(Pageable pageable);

    Page<Articulo> getAllArticulosByCategoria(Pageable pageable, Categoria categoria);

    List<Articulo> getAll();

    Page<PromocionFullDto> getAllFilteredPromocionesSortedByPrecio(Pageable pageable);

    Page<PromocionFullDto> getAllPromocionesByTipo(Pageable pageable, TipoPromocion tipoPromocion);
}
