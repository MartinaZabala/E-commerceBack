package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.mapper.ArticuloInsumoMapper;
import com.entidades.ecommerce.business.service.ArticuloInsumoService;
import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.CloudinaryService;
import com.entidades.ecommerce.domain.dto.articuloInsumo.ArticuloInsumoFullDto;
import com.entidades.ecommerce.domain.entities.*;
import com.entidades.ecommerce.repositories.ArticuloInsumoRepository;
import com.entidades.ecommerce.repositories.ImagenArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class ArticuloInsumoServiceImp extends BaseServiceImp<ArticuloInsumo, Long> implements ArticuloInsumoService {

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;
    @Autowired
    private ArticuloInsumoMapper articuloInsumoMapper;
    @Override
    public List<ArticuloInsumoFullDto> insumosParaElaborar(Long idSucursal) {
        List<ArticuloInsumo> insumos = this.articuloInsumoRepository.insumosParaElaborar(idSucursal);
        return articuloInsumoMapper.insumosToInsumoFullDtos(insumos);
    }
    @Override
    public List<ArticuloInsumoFullDto> insumos(Long idSucursal) {
        List<ArticuloInsumo> insumos = this.articuloInsumoRepository.insumos(idSucursal);
        return articuloInsumoMapper.insumosToInsumoFullDtos(insumos);
    }

}
