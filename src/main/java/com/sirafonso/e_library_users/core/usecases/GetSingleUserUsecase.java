package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.in.GetSingleUserInputPort;

import java.util.UUID;

public class GetSingleUserUsecase implements GetSingleUserInputPort {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public GetSingleUserUsecase(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Override
    public UserModelOut execute(UUID userId) {
        return this.userPersistenceAdapter.getSingleUser(userId);
    }
}
