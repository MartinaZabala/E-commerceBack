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

    public List<Articulo> getAll() {
        List<Articulo> allArticulos = new ArrayList<>();

        Page<ArticuloInsumo> insumosParaElaborar = articuloRepository.findInsumos(Pageable.unpaged());
        Page<ArticuloManufacturado> manufacturados = articuloRepository.findManufacturados(Pageable.unpaged());

        allArticulos.addAll(insumosParaElaborar.getContent());
        allArticulos.addAll(manufacturados.getContent());

        return allArticulos;
    }

    @Override
    public Page<Articulo> getAllFilteredArticulosSortedByPrecio(Pageable pageable) {
        List<Articulo> allArticulos = getAll();

        // Ordenar por precio
        allArticulos.sort(Comparator.comparingDouble(Articulo::getPrecioVenta));

        // Convertir la lista a Page
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), allArticulos.size());
        Page<Articulo> page = new PageImpl<>(allArticulos.subList(start, end), pageable, allArticulos.size());

        return page;
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
