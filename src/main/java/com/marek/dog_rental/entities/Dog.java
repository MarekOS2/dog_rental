package com.marek.dog_rental.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name should not be null")
    private String name;

    @Min(value = 0, message = "invalid dog age")
    private int age;

    @NotNull(message = "breed should not be null")
    @Enumerated(EnumType.STRING)
    private Breed breed;
}
