package com.entidades.ecommerce.business.service.Imp;


import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.ProvinciaService;
import com.entidades.ecommerce.domain.entities.Provincia;
import com.entidades.ecommerce.repositories.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImp extends BaseServiceImp<Provincia,Long> implements ProvinciaService {
    @Autowired
    ProvinciaRepository provinciaRepository;
    @Override
    public List<Provincia> findByPaisId(Long id) {
        return provinciaRepository.findByPaisId(id);
    }
}
