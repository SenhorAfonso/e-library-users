package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.in.UpdateUsernameInputPort;

import java.util.UUID;

public class UpdateUsernameUsecase implements UpdateUsernameInputPort {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public UpdateUsernameUsecase(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Override
    public UserModelOut execute(UUID userId, String newUsername) {
        return this.userPersistenceAdapter.updateUserUsername(userId, newUsername);
    }
}
