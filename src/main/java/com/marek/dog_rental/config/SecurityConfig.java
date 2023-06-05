package com.marek.dog_rental.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")
                        .requestMatchers("/api/supplier/**").hasAnyRole("SUPPLIER", "ADMIN")
                        .requestMatchers("/api/user/**").hasAnyRole("USER", "SUPPLIER", "ADMIN")
                        .anyRequest().authenticated()
                );
        return http.build();
    }
}
