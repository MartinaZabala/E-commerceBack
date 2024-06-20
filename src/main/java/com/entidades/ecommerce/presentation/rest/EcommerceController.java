package com.entidades.ecommerce.presentation.rest;

import com.entidades.ecommerce.business.facade.EcommerceFacade;
import com.entidades.ecommerce.business.service.CategoriaService;
import com.entidades.ecommerce.domain.entities.Articulo;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
@CrossOrigin("*")
public class EcommerceController {

    @Autowired
    private EcommerceFacade ecommerceFacade;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/articulos")
    public ResponseEntity<List<Articulo>> getAll() {
        List<Articulo> articulos = ecommerceFacade.getAll();
        return ResponseEntity.ok(articulos);
    }

    @GetMapping("/articulos/sortedByPrecio")
    public ResponseEntity<Page<Articulo>> getFilteredArticulosSortedByPrecio(Pageable pageable) {
        Page<Articulo> articulos = ecommerceFacade.getFilteredArticulosSortedByPrecio(pageable);
        return ResponseEntity.ok(articulos);
    }

    @GetMapping("/articulosByCategoria/{idCategoria}")
    public ResponseEntity<Page<Articulo>> getAllArticulosByCategoria(Pageable pageable, @PathVariable Long idCategoria) {
        Categoria categoria = categoriaService.getById(idCategoria); // Suponiendo que tienes un servicio para obtener la categoría por ID
        Page<Articulo> articulos = ecommerceFacade.getAllArticulosByCategoria(pageable, categoria);
        return ResponseEntity.ok(articulos);
    }
}
