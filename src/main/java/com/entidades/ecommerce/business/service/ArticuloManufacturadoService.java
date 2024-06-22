package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.articuloManufacturado.ArticuloManufacturadoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloManufacturado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {
    List<ArticuloManufacturadoFullDto> manufacturados(Long idSucursal);

}
