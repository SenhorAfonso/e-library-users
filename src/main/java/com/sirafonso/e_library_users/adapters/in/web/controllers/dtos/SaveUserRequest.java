package com.sirafonso.e_library_users.adapters.in.web.controllers.dtos;

import com.sirafonso.e_library_users.core.domain.models.UserModelIn;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SaveUserRequest (

    @NotBlank
    @Pattern(
            regexp = "^[a-zA-Z\\s]+$",
            message = "Name can only contain letters and space"
    )
    String name,

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z-_. ]+$")
    String username,

    @NotBlank
    @Email
    String email,

    @NotBlank
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[A-Za-z\\d!@#$%^&*(),.?\":{}|<>]{8,}$")
    String password
) {
    public UserModelIn toUserModelIn() {
        return UserModelIn.builder()
            .name(this.name())
            .username(this.username())
            .email(this.email())
            .password(this.password())
            .build();
    }
}
