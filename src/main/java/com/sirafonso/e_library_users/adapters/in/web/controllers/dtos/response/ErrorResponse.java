package com.sirafonso.e_library_users.adapters.in.web.controllers.dtos.response;

import lombok.Getter;

@Getter
public class ErrorResponse {
    private String code;
    private String message;
    private int status;

    public ErrorResponse(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

}
