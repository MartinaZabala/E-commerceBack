package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.promocion.PromocionFullDto;
import com.entidades.ecommerce.domain.entities.Promocion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SucursalMapper.class})
public interface PromocionMapper extends BaseMapper<Promocion, PromocionFullDto>{
    List<PromocionFullDto> promocionesToPromocionFullDto(List<Promocion> promociones);

}
