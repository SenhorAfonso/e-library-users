package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.ports.in.DeleteUserInputPort;

import java.util.UUID;

public class DeleteUserUsecase implements DeleteUserInputPort {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public DeleteUserUsecase(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Override
    public void execute(UUID userId) {
        this.userPersistenceAdapter.deleteUser(userId);
    }
}
