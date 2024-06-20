package com.entidades.ecommerce.domain.dto.articuloInsumo;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
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
public class ArticuloInsumoFullDto extends BaseDto {
    //de articulo
    private String denominacion;
    private String precioVenta;
    //propios de la clase
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Integer stockMinimo;
    private Boolean esParaElaborar;
    //de unidadMedida
    private UnidadMedidaFullDto unidadMedida;
    //de categoria
    private CategoriaCreateDto categoria;
    private Set<ImagenDto> imagenes;
    //sucursal
    private SucursalShortDto sucursal;

}
