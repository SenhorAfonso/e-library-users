package com.sirafonso.e_library_users.config;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.ports.in.*;
import com.sirafonso.e_library_users.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InputPortinjection {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public InputPortinjection(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Bean
    public SaveUserInputPort saveUser() {
        return new SaveUserUsecase(this.userPersistenceAdapter);
    }

    @Bean
    public GetAllUsersInputPort getAllUsers() {
        return new GetAllUsersUsecase(this.userPersistenceAdapter);
    }

    @Bean
    public GetSingleUserInputPort getSingleUser() {
        return new GetSingleUserUsecase(this.userPersistenceAdapter);
    }

    @Bean
    public UpdateUsernameInputPort updateUserUsername() {
        return new UpdateUsernameUsecase(this.userPersistenceAdapter);
    }

    @Bean
    public DeleteUserInputPort deleteUser() {
        return new DeleteUserUsecase(this.userPersistenceAdapter);
    }

}
