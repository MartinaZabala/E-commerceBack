package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.EmpleadoService;
import com.entidades.ecommerce.domain.entities.Empleado;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImp extends BaseServiceImp<Empleado, Long> implements EmpleadoService {
}
