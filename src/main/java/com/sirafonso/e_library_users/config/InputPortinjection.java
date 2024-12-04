package com.sirafonso.e_library_users.config;

import com.sirafonso.e_library_users.core.ports.in.*;
import com.sirafonso.e_library_users.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InputPortinjection {

    @Bean
    public SaveUserInputPort saveUser() {
        return new SaveUserUsecase();
    }

    @Bean
    public GetAllUsersInputPort getAllUsers() {
        return new GetAllUsersUsecase();
    }

    @Bean
    public GetSingleUserInputPort getSingleUser() {
        return new GetSingleUserUsecase();
    }

    @Bean
    public UpdateUsernameInputPort updateUserUsername() {
        return new UpdateUsernameUsecase();
    }

    @Bean
    public DeleteUserInputPort deleteUser() {
        return new DeleteUserUsecase();
    }

}
