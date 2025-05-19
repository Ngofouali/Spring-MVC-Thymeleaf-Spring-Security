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

    @NotBlank(message = "Le nom ne peut être vide")
    @Size(min = 10, max = 50, message = "Le nom doit contenir entre 10 et 100 caractères")
    @Column(nullable = false, length = 100)
    private String nom;

    @NotNull(message = "Le prix ne peut être vide")
    @PositiveOrZero(message = "Le prix doit être posotif ou égal à 0")
    @Column(nullable = false)
    private Double prix;

    @NotNull(message = "La quantité ne peut être vide")
    @Min(value = 0, message = "La quantité doit être au moins égale à 0")
    @Column(nullable = false)
    private Integer quantiteEnStock;
}
