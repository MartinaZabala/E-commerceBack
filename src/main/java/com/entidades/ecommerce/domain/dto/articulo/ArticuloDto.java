package com.entidades.ecommerce.domain.dto.articulo;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.dto.unidadMedida.UnidadMedidaFullDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloDto extends BaseDto {
    protected String denominacion;
    protected Double precioVenta;
    protected Set<ImagenDto> imagenes = new HashSet<>();
    protected UnidadMedidaFullDto unidadMedida;
    protected CategoriaCreateDto categoria;
}
