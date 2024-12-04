package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.core.ports.in.GetSingleUserInputPort;

public class GetSingleUserUsecase implements GetSingleUserInputPort {

    @Override
    public String execute(String userId) {
        return "Getting user with id =" + userId;
    }
}
