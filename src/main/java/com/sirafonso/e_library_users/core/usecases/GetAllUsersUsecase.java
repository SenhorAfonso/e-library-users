package com.sirafonso.e_library_users.core.usecases;

import com.sirafonso.e_library_users.core.ports.in.GetAllUsersInputPort;

public class GetAllUsersUsecase implements GetAllUsersInputPort {
    @Override
    public String execute() {
        return "Getting all users";
    }
}
