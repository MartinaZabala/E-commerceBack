package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.provincia.ProvinciaFullDto;
import com.entidades.ecommerce.domain.entities.Provincia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvinciaMapper extends BaseMapper<Provincia, ProvinciaFullDto>{

}
