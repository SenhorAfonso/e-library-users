package com.sirafonso.e_library_users.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterchain(HttpSecurity http) throws Exception {
        http
            .csrf() //TODO: what is the correct way of doing this?
            .disable()
                .authorizeHttpRequests()
                .requestMatchers("/users/**").permitAll();

        return http.build();
    }
}
