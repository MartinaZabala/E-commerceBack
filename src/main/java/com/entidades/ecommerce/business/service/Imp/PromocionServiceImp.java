package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.mapper.PromocionMapper;
import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.CloudinaryService;
import com.entidades.ecommerce.business.service.PromocionService;
import com.entidades.ecommerce.domain.dto.promocion.PromocionFullDto;
import com.entidades.ecommerce.domain.entities.*;
import com.entidades.ecommerce.repositories.ImagenPromocionRepository;
import com.entidades.ecommerce.repositories.PromocionRepository;
import com.entidades.ecommerce.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class PromocionServiceImp extends BaseServiceImp<Promocion, Long> implements PromocionService {

    @Autowired
    PromocionRepository promocionRepository;

    @Autowired
    SucursalRepository sucursalRepository;
    @Autowired
    PromocionMapper promocionMapper;
    @Override
    public List<PromocionFullDto> promocionSucursal(Long idSucursal) {
        List<Promocion> promociones = this.promocionRepository.promocionSucursal(idSucursal);
        return promocionMapper.promocionesToPromocionFullDto(promociones);
    }
}
