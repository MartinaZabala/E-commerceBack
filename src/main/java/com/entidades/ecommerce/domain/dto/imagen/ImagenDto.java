package com.entidades.ecommerce.domain.dto.imagen;

import com.entidades.ecommerce.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImagenDto extends BaseDto {
    private String name;
    private String url;
}
