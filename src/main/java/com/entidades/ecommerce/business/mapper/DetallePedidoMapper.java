package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.detallePedido.DetallePedidoFullDto;
import com.entidades.ecommerce.domain.entities.DetallePedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ArticuloMapper.class })
public interface DetallePedidoMapper extends BaseMapper<DetallePedido, DetallePedidoFullDto>{
}
