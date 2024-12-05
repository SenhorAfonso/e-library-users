package com.sirafonso.e_library_users.core.ports.out;

import com.sirafonso.e_library_users.core.domain.models.UserModelIn;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;

import java.util.List;
import java.util.UUID;

public interface UserPersistenceOutputPort {
    UserModelOut saveUser(UserModelIn newUser);
    List<UserModelOut> getAllUsers();
    UserModelOut getSingleUser(UUID userId);
    UserModelOut updateUserUsername(UUID userId, String newUsername);
    void deleteUser(UUID userId);
}
