package com.aspire.userservice.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class APIUnprocessableEntity extends Exception{
    public APIUnprocessableEntity(String message){
        super(message);
    }
}
