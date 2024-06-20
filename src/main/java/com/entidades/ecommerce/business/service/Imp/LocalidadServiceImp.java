package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.LocalidadService;
import com.entidades.ecommerce.domain.entities.Localidad;
import com.entidades.ecommerce.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImp extends BaseServiceImp<Localidad,Long> implements LocalidadService {

    @Autowired
    LocalidadRepository localidadRepository;

    @Override
    public List<Localidad> findByProvinciaId(Long id) {
        return localidadRepository.findByProvinciaId(id);
    }
}
