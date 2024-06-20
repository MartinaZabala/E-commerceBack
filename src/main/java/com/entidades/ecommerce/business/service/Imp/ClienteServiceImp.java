package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.ClienteService;
import com.entidades.ecommerce.domain.entities.Cliente;
import com.entidades.ecommerce.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp extends BaseServiceImp<Cliente, Long> implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente findByEmail(String email) {
        return this.clienteRepository.findByEmail(email);
    }

}
