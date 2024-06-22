package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.mapper.CategoriaMapper;
import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.CategoriaService;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
import com.entidades.ecommerce.domain.entities.Categoria;
import com.entidades.ecommerce.domain.entities.Sucursal;
import com.entidades.ecommerce.repositories.CategoriaRepository;
import com.entidades.ecommerce.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CategoriaServiceImp extends BaseServiceImp<Categoria, Long> implements CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    SucursalRepository sucursalRepository;

    @Autowired
    CategoriaMapper categoriaMapper;
    @Override
    public List<Categoria> getAll() {
        // Obtener todas las categorías del repositorio
        List<Categoria> categorias = categoriaRepository.categorias();
        return categorias;
    }
    @Override
    public List<CategoriaCreateDto> categoriaSucursal(Long idSucursal) {
        // Obtener la lista de categorías que están asociadas a la sucursal
        List<Categoria> categorias = this.categoriaRepository.categoriaSucursal(idSucursal);

        // Convertir la lista de categorías en un DTO utilizando el mapper
        List<CategoriaCreateDto> categoriaCreateDTOs = categoriaMapper.categoriasToCategoriaCreateDto(categorias);

        // Devolver la lista de DTOs procesados
        return categoriaCreateDTOs;
    }
}
