package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.sucursal.SucursalFullDto;
import com.entidades.ecommerce.domain.entities.Sucursal;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaMapper.class })
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalFullDto>{
    List<SucursalFullDto> sucursalesToSucursalFullDto(List<Sucursal> sucursales);
}
