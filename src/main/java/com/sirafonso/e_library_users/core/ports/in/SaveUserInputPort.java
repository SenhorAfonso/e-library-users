package com.sirafonso.e_library_users.core.ports.in;

import com.sirafonso.e_library_users.core.domain.models.UserModelIn;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;

public interface SaveUserInputPort {
    UserModelOut execute(UserModelIn newUser);
}
