package com.entidades.ecommerce.business.facade;

import com.entidades.ecommerce.business.facade.Base.BaseFacade;
import com.entidades.ecommerce.domain.dto.promocion.PromocionFullDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface PromocionFacade extends BaseFacade<PromocionFullDto, Long> {
    List<PromocionFullDto> promocionSucursal(Long idSucursal);

}
