package com.marek.dog_rental.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@NoArgsConstructor
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Getter
    private String username;

    // password must contain min. 8 characters, 1 letter and 1 number
    @NotNull
    @Getter
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",
            message = "password not valid")
    private String password;

    @NotNull
    @Getter
    @Email(message = "email not valid")
    private String email;


}
