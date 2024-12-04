package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.core.ports.in.SaveUserInputPort;

public class SaveUserUsecase implements SaveUserInputPort {

    @Override
    public String execute(String username) {
        return "Saving user with name " + username;
    }
}
