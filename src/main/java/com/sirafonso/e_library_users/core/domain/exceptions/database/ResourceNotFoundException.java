package com.sirafonso.e_library_users.core.domain.exceptions.database;

public class ResourceNotFoundException extends DatabaseException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
