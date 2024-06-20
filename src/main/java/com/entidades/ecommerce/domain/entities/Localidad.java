package com.entidades.ecommerce.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
public class Localidad extends Base{
    private String nombre;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

}
