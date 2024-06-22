package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.articuloInsumo.ArticuloInsumoFullDto;
import com.entidades.ecommerce.domain.entities.ArticuloInsumo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface ArticuloInsumoFacade extends BaseFacade<ArticuloInsumoFullDto,Long> {
    List<ArticuloInsumoFullDto> insumosParaElaborar(Long idSucursal);
    List<ArticuloInsumoFullDto> insumos(Long idSucursal);
}
