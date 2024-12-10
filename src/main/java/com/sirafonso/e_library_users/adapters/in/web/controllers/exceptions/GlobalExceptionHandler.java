package com.sirafonso.e_library_users.adapters.in.web.controllers.exceptions;

import com.sirafonso.e_library_users.adapters.in.web.controllers.dtos.response.ErrorResponse;
import com.sirafonso.e_library_users.core.domain.exceptions.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorResponse> handleApiCustomError(ApiException ex) {

        ErrorResponse errorResponse = new ErrorResponse(
                ex.getCode(),
                ex.getMessage(),
                ex.getStatus()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(ex.getStatus()));
    }

}
