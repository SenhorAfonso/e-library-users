package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.adapters.out.persistence.UserPersistenceAdapter;
import com.sirafonso.e_library_users.core.domain.exceptions.ExceptionCode;
import com.sirafonso.e_library_users.core.domain.exceptions.ExceptionMessage;
import com.sirafonso.e_library_users.core.domain.exceptions.api.UserNotFoundException;
import com.sirafonso.e_library_users.core.domain.exceptions.database.ResourceNotFoundException;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.in.GetSingleUserInputPort;

import java.util.UUID;

public class GetSingleUserUsecase implements GetSingleUserInputPort {
    private final UserPersistenceAdapter userPersistenceAdapter;

    public GetSingleUserUsecase(UserPersistenceAdapter userPersistenceAdapter) {
        this.userPersistenceAdapter = userPersistenceAdapter;
    }

    @Override
    public UserModelOut execute(UUID userId) throws UserNotFoundException {
        try {
            return this.userPersistenceAdapter.getSingleUser(userId);
        } catch (ResourceNotFoundException err) {
            throw new UserNotFoundException(
                    ExceptionMessage.ID_NOT_FOUND.getDescription(),
                    ExceptionCode.USER_NOT_FOUND
            );
        }
    }
}
