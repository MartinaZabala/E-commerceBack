package com.entidades.ecommerce.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class PromocionDetalle extends Base{

    private int cantidad;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
}
