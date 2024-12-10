package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.domain.models.UserModelIn;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.in.SaveUserInputPort;

public class SaveUserUsecase implements SaveUserInputPort {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public SaveUserUsecase(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Override
    public UserModelOut execute(UserModelIn newUser) {
        return this.userPersistenceAdapter.saveUser(newUser);
    }
}
