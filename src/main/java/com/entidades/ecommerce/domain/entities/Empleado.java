package com.entidades.ecommerce.domain.entities;

import com.entidades.ecommerce.domain.enums.Rol;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@Audited
public class Empleado extends Base{

    private Rol tipoEmpleado;

//    @OneToMany(mappedBy = "empleado", cascade = CascadeType.REFRESH, orphanRemoval = true)
//    @ToString.Exclude
//    @Builder.Default
//    private Set<Pedido> pedidos= new HashSet<>();

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "sucursal_id")
    @JsonManagedReference
    private Sucursal sucursal;
}
