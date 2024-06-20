package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.UsuarioFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.business.service.UsuarioService;
import com.entidades.ecommerce.domain.dto.usuarioCliente.UsuarioDto;
import com.entidades.ecommerce.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacadeImp extends BaseFacadeImp<Usuario, UsuarioDto, Long> implements UsuarioFacade {

    private UsuarioService usuarioService;

    public UsuarioFacadeImp(BaseService<Usuario, Long> baseService, BaseMapper<Usuario, UsuarioDto> baseMapper, UsuarioService usuarioService) {
        super(baseService, baseMapper);
        this.usuarioService = usuarioService;
    }

    public Usuario obtenerUsuarioPorEmail(String email) {
        return this.usuarioService.obtenerUsuarioPorEmail(email);
    }
}
