package com.entidades.ecommerce.domain.entities;

import com.entidades.ecommerce.domain.enums.Rol;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Audited
public class Usuario extends Base{
    private String auth0Id;
    private String username;
    private String email;
    private Rol rol;

//    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REFRESH, orphanRemoval = true)
//    @ToString.Exclude
//    @Builder.Default
//    private Set<Pedido> pedidos= new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
}
