package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.ClienteFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.business.service.ClienteService;
import com.entidades.ecommerce.domain.dto.cliente.ClienteFullDto;
import com.entidades.ecommerce.domain.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteFacadeImp extends BaseFacadeImp<Cliente, ClienteFullDto, Long> implements ClienteFacade {

    @Autowired
    private ClienteService clienteService;

    public ClienteFacadeImp(BaseService<Cliente, Long> baseService, BaseMapper<Cliente, ClienteFullDto> baseMapper) {
        super(baseService, baseMapper);
    }

    public Cliente findByEmail(String email) {
        return this.clienteService.findByEmail(email);
    }

}
