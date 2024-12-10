package com.sirafonso.e_library_users.core.domain.exceptions;

public enum ExceptionCode {
    USER_NOT_FOUND("GetSingleUser.IdDoesNotExist", ExceptionMessage.ID_NOT_FOUND);

    private String errorCode;
    private ExceptionMessage errorMessage;

    ExceptionCode(String errorCode, ExceptionMessage errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage.getDescription();
    }

}
