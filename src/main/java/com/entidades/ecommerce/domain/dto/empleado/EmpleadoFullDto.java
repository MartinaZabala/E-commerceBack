package com.entidades.ecommerce.domain.dto.empleado;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpleadoFullDto extends BaseDto {
    private Rol tipoEmpleado;

}
