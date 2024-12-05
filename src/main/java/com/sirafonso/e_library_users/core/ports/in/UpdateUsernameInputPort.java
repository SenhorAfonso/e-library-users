package com.sirafonso.e_library_users.core.ports.in;

import com.sirafonso.e_library_users.core.domain.models.UserModelOut;

import java.util.UUID;

public interface UpdateUsernameInputPort {
    UserModelOut execute(UUID userId, String newUsername);
}
