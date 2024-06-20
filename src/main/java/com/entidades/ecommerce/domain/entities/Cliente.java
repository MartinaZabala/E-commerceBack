package com.entidades.ecommerce.domain.entities;

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
public class Cliente extends Base{

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToOne
    private Usuario usuario;

//    @OneToOne
//    @NotAudited
//    private ImagenCliente imagenCliente;
//
//    @ManyToMany
//    //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
//    @JoinTable(name = "cliente_domicilio",
//            joinColumns = @JoinColumn(name = "cliente_id"),
//            inverseJoinColumns = @JoinColumn(name = "domicilio_id"))
//    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
//    @Builder.Default
//    private Set<Domicilio> domicilios = new HashSet<>();
//
//    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
//    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
//    @Builder.Default
//    private Set<Pedido> pedidos = new HashSet<>();
}