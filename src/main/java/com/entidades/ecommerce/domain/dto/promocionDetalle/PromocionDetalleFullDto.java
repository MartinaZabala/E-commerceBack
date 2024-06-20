package com.entidades.ecommerce.domain.dto.promocionDetalle;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.articulo.ArticuloDto;
import com.entidades.ecommerce.domain.dto.articuloManufacturado.ArticuloManufacturadoShortDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PromocionDetalleFullDto extends BaseDto {
    private Integer cantidad;
    private ArticuloDto articulo;
}
