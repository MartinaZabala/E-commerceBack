package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.pais.PaisFullDto;
import com.entidades.ecommerce.domain.entities.Pais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaisMapper extends BaseMapper<Pais, PaisFullDto>{

}
