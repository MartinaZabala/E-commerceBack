package com.entidades.ecommerce.domain.dto.empresa;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.dto.sucursal.SucursalFullDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaFullDto extends BaseDto {
    private String nombre;
    private String razonSocial;
    private Long cuil;
    private Set<SucursalFullDto> sucursales;
    private Set<ImagenDto> imagenes;
}
