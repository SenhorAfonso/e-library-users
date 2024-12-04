package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.core.ports.in.UpdateUsernameInputPort;

public class UpdateUsernameUsecase implements UpdateUsernameInputPort {


    @Override
    public String execute(String userId, String newUsername) {
        return "Updating users of id: " + userId + "username to " + "username";
    }
}
