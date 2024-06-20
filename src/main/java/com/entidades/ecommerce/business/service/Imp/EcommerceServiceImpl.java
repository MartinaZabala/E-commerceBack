package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.service.EcommerceService;
import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.ArticuloInsumo;
import com.entidades.ecommerce.domain.entities.ArticuloManufacturado;
import com.entidades.ecommerce.domain.entities.Categoria;
import com.entidades.ecommerce.repositories.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class EcommerceServiceImpl implements EcommerceService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public Page<Articulo> getAllFilteredArticulosSortedByPrecio(Pageable pageable) {

        Page<ArticuloInsumo> insumosParaElaborar = articuloRepository.findInsumos(pageable);
        Page<ArticuloManufacturado> manufacturados = articuloRepository.findManufacturados(pageable);

        // Combinar ambas páginas
        List<Articulo> allArticulos = new ArrayList<>();
        allArticulos.addAll(insumosParaElaborar.getContent());
        allArticulos.addAll(manufacturados.getContent());

        // Ordenar por precio
        allArticulos.sort(Comparator.comparingDouble(Articulo::getPrecioVenta));

        // Convertir la lista a Page
        return new PageImpl<>(allArticulos, pageable, allArticulos.size());
    }

    @Override
    public Page<Articulo> getAllArticulosByCategoria(Pageable pageable, Categoria categoria) {
        Page<ArticuloInsumo> insumosParaElaborar = articuloRepository.findInsumosByCategoria(pageable, categoria);
        Page<ArticuloManufacturado> manufacturados = articuloRepository.findManufacturadosByCategoria(pageable, categoria);

        List<Articulo> allArticulos = new ArrayList<>();
        allArticulos.addAll(insumosParaElaborar.getContent());
        allArticulos.addAll(manufacturados.getContent());

        allArticulos.sort(Comparator.comparingDouble(Articulo::getPrecioVenta));

        return new PageImpl<>(allArticulos, pageable, allArticulos.size());
    }

}
