package com.entidades.ecommerce.domain.dto.unidadMedida;

import com.entidades.ecommerce.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UnidadMedidaFullDto extends BaseDto {

    private String denominacion;
}
