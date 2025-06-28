package com.icodi.manadja.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Le nom ne peut être vide")
    @Size(min = 10, max = 50, message = "Le nom doit contenir entre 10 et 100 caractères")
    private String nom;

    //@NotNull(message = "Le prix ne peut être vide")
    @Min(0)
    private Double prix;

    //@NotNull(message = "La quantité ne peut être vide")
    @Min(value = 1, message = "La quantité doit être au moins égale à 1")
    //@Min(1)
    private Integer quantiteEnStock;
}
