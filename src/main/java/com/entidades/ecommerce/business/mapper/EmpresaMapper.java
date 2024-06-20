package com.entidades.ecommerce.business.mapper;


import com.entidades.ecommerce.domain.dto.empresa.EmpresaCreateDto;
import com.entidades.ecommerce.domain.dto.empresa.EmpresaFullDto;
import com.entidades.ecommerce.domain.entities.Empresa;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaCreateDto> {


    EmpresaFullDto toLargeDto(Empresa empresa);


}
