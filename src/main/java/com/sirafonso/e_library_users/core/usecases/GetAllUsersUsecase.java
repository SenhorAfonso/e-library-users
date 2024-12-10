package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.in.GetAllUsersInputPort;

import java.util.List;

public class GetAllUsersUsecase implements GetAllUsersInputPort {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public GetAllUsersUsecase(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Override
    public List<UserModelOut> execute() {
        return this.userPersistenceAdapter.getAllUsers();
    }
}
