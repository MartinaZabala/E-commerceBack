package com.entidades.ecommerce.domain.dto.articuloManufacturadoDetalle;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.articuloInsumo.ArticuloInsumoShortDto;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoDetalleFullDto extends BaseDto {
    private Integer cantidad;
    private ArticuloInsumoShortDto articuloInsumo;
}
