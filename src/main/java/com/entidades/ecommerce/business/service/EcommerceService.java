package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EcommerceService {

    Page<Articulo> getAllFilteredArticulosSortedByPrecio(Pageable pageable);

    Page<Articulo> getAllArticulosByCategoria(Pageable pageable, Categoria categoria);

}
