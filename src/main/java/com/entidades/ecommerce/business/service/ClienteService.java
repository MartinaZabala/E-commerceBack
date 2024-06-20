package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.entities.Cliente;

public interface ClienteService extends BaseService<Cliente, Long> {

    Cliente findByEmail(String email);

}
