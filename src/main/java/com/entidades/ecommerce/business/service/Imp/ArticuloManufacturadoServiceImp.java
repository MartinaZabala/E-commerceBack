package com.entidades.ecommerce.business.service.Imp;

import com.entidades.ecommerce.business.mapper.ArticuloManufacturadoMapper;
import com.entidades.ecommerce.business.service.ArticuloManufacturadoService;
import com.entidades.ecommerce.business.service.Base.BaseServiceImp;
import com.entidades.ecommerce.business.service.CloudinaryService;
import com.entidades.ecommerce.domain.dto.articuloManufacturado.ArticuloManufacturadoFullDto;
import com.entidades.ecommerce.domain.entities.*;
import com.entidades.ecommerce.repositories.ArticuloInsumoRepository;
import com.entidades.ecommerce.repositories.ArticuloManufacturadoDetalleRepository;
import com.entidades.ecommerce.repositories.ArticuloManufacturadoRepository;
import com.entidades.ecommerce.repositories.ImagenArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
@Service
public class ArticuloManufacturadoServiceImp extends BaseServiceImp<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    @Autowired
    ImagenArticuloRepository imagenArticuloRepository;
    @Autowired
    private CloudinaryService cloudinaryService; // Servicio para interactuar con Cloudinary
    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
    @Autowired
    private ArticuloManufacturadoMapper articuloManufacturadoMapper;
    @Override
    public List<ArticuloManufacturadoFullDto> manufacturados(Long idSucursal) {
        List<ArticuloManufacturado> manufacturados = this.articuloManufacturadoRepository.manufacturados(idSucursal);
        return articuloManufacturadoMapper.manufacturadosToManufacturadoFullDtos(manufacturados);
    }
}
