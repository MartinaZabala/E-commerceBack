package com.entidades.ecommerce.domain.dto.provincia;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.pais.PaisFullDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProvinciaFullDto extends BaseDto {
    private String nombre;
    private PaisFullDto pais;
}
