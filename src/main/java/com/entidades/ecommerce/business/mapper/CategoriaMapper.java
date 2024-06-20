package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SucursalMapper.class})
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaCreateDto>{
    List<CategoriaCreateDto> categoriasToCategoriaCreateDto(List<Categoria> categorias);

}
