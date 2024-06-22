package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.ArticuloManufacturadoFacade;
import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.ArticuloManufacturadoService;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.articuloManufacturado.ArticuloManufacturadoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloManufacturado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class ArticuloManufacturadoFacadeImp extends BaseFacadeImp<ArticuloManufacturado, ArticuloManufacturadoFullDto,Long> implements ArticuloManufacturadoFacade {
    public ArticuloManufacturadoFacadeImp(BaseService<ArticuloManufacturado, Long> baseService, BaseMapper<ArticuloManufacturado, ArticuloManufacturadoFullDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    ArticuloManufacturadoService articuloManufacturadoService;
    @Override
    public List<ArticuloManufacturadoFullDto> manufacturados(Long idSucursal) {
        return this.articuloManufacturadoService.manufacturados(idSucursal);
    }
}
