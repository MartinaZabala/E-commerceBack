package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.entities.Provincia;
import java.util.List;

public interface ProvinciaService extends BaseService<Provincia, Long> {
    List<Provincia> findByPaisId(Long id);
}
