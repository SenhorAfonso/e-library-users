package com.sirafonso.e_library_users.core.domain.exceptions;

public class ApiException extends RuntimeException {
    protected int httpStatus;
    protected String errorCode;

    public ApiException(
        String message,
        Integer httpStatus,
        String errorCode
    ) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }

    public String getCode() {
        return this.errorCode;
    }

    public Integer getStatus() {
        return this.httpStatus;
    }
}
