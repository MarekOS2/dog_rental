package com.marek.dog_rental.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Dog {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @Min(value = 0, message = "invalid dog age")
    private int age;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Breed breed;
}
