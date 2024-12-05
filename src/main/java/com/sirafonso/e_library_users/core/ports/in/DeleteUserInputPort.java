package com.sirafonso.e_library_users.core.ports.in;

import java.util.UUID;

public interface DeleteUserInputPort {
    void execute(UUID userId);
}
