package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.core.ports.in.DeleteUserInputPort;

public class DeleteUserUsecase implements DeleteUserInputPort {


    @Override
    public String execute(String userId) {
        return "deleting user" + userId;
    }
}
