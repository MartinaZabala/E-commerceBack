package com.entidades.ecommerce.domain.dto.pedido;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.dto.cliente.ClienteFullDto;
import com.entidades.ecommerce.domain.dto.detallePedido.DetallePedidoFullDto;
import com.entidades.ecommerce.domain.dto.domicilio.DomicilioFullDto;
import com.entidades.ecommerce.domain.dto.sucursal.SucursalShortDto;
import com.entidades.ecommerce.domain.dto.usuarioCliente.UsuarioDto;
import com.entidades.ecommerce.domain.entities.Factura;
import com.entidades.ecommerce.domain.enums.Estado;
import com.entidades.ecommerce.domain.enums.FormaPago;
import com.entidades.ecommerce.domain.enums.TipoEnvio;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoFullDto extends BaseDto {
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Set<DetallePedidoFullDto> detallePedidos;
    private Factura factura;
    private SucursalShortDto sucursal;
    private ClienteFullDto cliente;
    private UsuarioDto usuario;
    private DomicilioFullDto domicilio;
}
