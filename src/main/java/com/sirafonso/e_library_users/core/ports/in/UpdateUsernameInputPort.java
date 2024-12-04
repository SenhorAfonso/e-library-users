package com.sirafonso.e_library_users.core.ports.in;

public interface UpdateUsernameInputPort {
    String execute(String userId, String newUsername);
}
