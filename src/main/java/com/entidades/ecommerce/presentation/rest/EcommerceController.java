package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.EcommerceFacade;
import com.entidades.ecommerce.business.service.CategoriaService;
import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecommerce")
@CrossOrigin("*")
public class EcommerceController {

    @Autowired
    private EcommerceFacade ecommerceFacade;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/articulos/sortedByPrecio")
    public Page<Articulo> getFilteredArticulosSortedByPrecio(Pageable pageable) {
        return ecommerceFacade.getFilteredArticulosSortedByPrecio(pageable);
    }


    @GetMapping("/articulosByCategoria/{idCategoria}")
    public Page<Articulo> getAllArticulosByCategoria(Pageable pageable, @PathVariable Long idCategoria) {
        // Lógica para obtener los artículos por categoría utilizando idCategoria
        Categoria categoria = categoriaService.getById(idCategoria); // Suponiendo que tienes un servicio para obtener la categoría por ID
        return ecommerceFacade.getAllArticulosByCategoria(pageable, categoria);
    }

}
