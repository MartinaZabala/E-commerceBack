package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.UsuarioEmpleadoFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.usuarioEmpleado.UsuarioEmpleadoFullDto;
import com.entidades.ecommerce.domain.entities.UsuarioEmpleado;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEmpleadoFacadeImp extends BaseFacadeImp<UsuarioEmpleado, UsuarioEmpleadoFullDto, Long> implements UsuarioEmpleadoFacade {


    public UsuarioEmpleadoFacadeImp(BaseService<UsuarioEmpleado, Long> baseService, BaseMapper<UsuarioEmpleado, UsuarioEmpleadoFullDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
