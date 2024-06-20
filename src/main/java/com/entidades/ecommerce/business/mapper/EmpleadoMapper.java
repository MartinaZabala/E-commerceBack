package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.empleado.EmpleadoFullDto;
import com.entidades.ecommerce.domain.entities.Empleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper extends BaseMapper<Empleado, EmpleadoFullDto>{
}
