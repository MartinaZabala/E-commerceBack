package com.entidades.ecommerce.domain.dto.articuloManufacturado;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaShortDto;
import com.entidades.ecommerce.domain.dto.unidadMedida.UnidadMedidaFullDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoShortDto extends BaseDto {
    //de articulo
    private String denominacion;
    private String precioVenta;
    //propios de la clase
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private UnidadMedidaFullDto unidadMedida;
    private CategoriaShortDto categoria;
}
