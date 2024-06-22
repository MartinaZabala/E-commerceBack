package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.ArticuloInsumoFacade;
import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.ArticuloInsumoService;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.articuloInsumo.ArticuloInsumoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class ArticuloInsumoFacadeImp extends BaseFacadeImp<ArticuloInsumo, ArticuloInsumoFullDto, Long> implements ArticuloInsumoFacade {
    public ArticuloInsumoFacadeImp(BaseService<ArticuloInsumo,Long> baseService, BaseMapper<ArticuloInsumo, ArticuloInsumoFullDto> baseMapper){
        super(baseService, baseMapper);
    }
    @Autowired
    ArticuloInsumoService articuloInsumoService;
    @Override
    public List<ArticuloInsumoFullDto> insumosParaElaborar(Long idSucursal) {
        return this.articuloInsumoService.insumosParaElaborar(idSucursal);
    }
    @Override
    public List<ArticuloInsumoFullDto> insumos(Long idSucursal) {
        return this.articuloInsumoService.insumos(idSucursal);
    }
}
