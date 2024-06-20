package com.entidades.ecommerce.domain.dto.articuloManufacturado;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.articuloManufacturadoDetalle.ArticuloManufacturadoDetalleFullDto;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaFullDto;
import com.entidades.ecommerce.domain.dto.imagen.ImagenDto;
import com.entidades.ecommerce.domain.dto.sucursal.SucursalShortDto;
import com.entidades.ecommerce.domain.dto.unidadMedida.UnidadMedidaFullDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoFullDto extends BaseDto {
    //de articulo
    private String denominacion;
    private Double precioVenta;
    //de imagenArticulo
    private Set<ImagenDto> imagenes;
    //de categoria
    private CategoriaFullDto categoria;
    //propios de la entidad
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    //de unidad medida
    private UnidadMedidaFullDto unidadMedida;
    //de articuloManufacturadoDetalle
    private Set<ArticuloManufacturadoDetalleFullDto> articuloManufacturadoDetalles;
    //sucursal
    private SucursalShortDto sucursal;
}
