package com.caiquekola.todosimple.services.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class DataBindindViolationException extends DataIntegrityViolationException {
    public DataBindindViolationException(String message) {
        super(message);
    }
}
