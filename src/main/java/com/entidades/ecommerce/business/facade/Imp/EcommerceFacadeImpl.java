package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.EcommerceFacade;
import com.entidades.ecommerce.business.service.EcommerceService;
import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceFacadeImpl implements EcommerceFacade {

    @Autowired
    private EcommerceService ecommerceService;

    @Override
    public Page<Articulo> getFilteredArticulosSortedByPrecio(Pageable pageable) {
        return ecommerceService.getAllFilteredArticulosSortedByPrecio(pageable);
    }

    @Override
    public Page<Articulo> getAllArticulosByCategoria(Pageable pageable, Categoria categoria) {
        return ecommerceService.getAllArticulosByCategoria(pageable, categoria);
    }
}
