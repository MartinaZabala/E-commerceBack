package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.entities.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {
    List<Localidad> findByProvinciaId(Long id);
}
