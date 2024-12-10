package com.sirafonso.e_library_users.core.ports.in;

import com.sirafonso.e_library_users.core.domain.models.UserModelOut;

import java.util.List;

public interface GetAllUsersInputPort {
    List<UserModelOut> execute();
}
