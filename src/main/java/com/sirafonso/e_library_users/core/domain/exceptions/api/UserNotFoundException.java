package com.sirafonso.e_library_users.core.domain.exceptions.api;

import com.sirafonso.e_library_users.core.domain.exceptions.ApiException;
import com.sirafonso.e_library_users.core.domain.exceptions.ExceptionCode;

public class UserNotFoundException extends ApiException {
    public UserNotFoundException(
        String message,
        ExceptionCode errorCode
        ) {
        super(message, 404, errorCode.getErrorCode());
    }
}
