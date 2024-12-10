package com.sirafonso.e_library_users.core.domain.exceptions;

public enum ExceptionMessage {
    ID_NOT_FOUND("The provided id was not found");

    private String description;

    ExceptionMessage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
