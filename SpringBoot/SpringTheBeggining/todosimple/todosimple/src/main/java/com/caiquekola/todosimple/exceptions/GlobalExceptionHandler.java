package com.caiquekola.todosimple.exceptions;

import javax.validation.ConstraintViolationException;

import com.caiquekola.todosimple.services.exceptions.DataBindindViolationException;
import com.caiquekola.todosimple.services.exceptions.ObjectNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


//anotações no console
@Slf4j(topic = "GLOBAL_EXCPETION_HANDLER")
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Value("${server.error.include-exception}")
    private boolean printStackStrace;


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleAllUncaughtException(Exception exception, WebRequest request) {
        final String errorMessage = "Unknown error ocurred";
        log.error(errorMessage,exception);
        return buildErrorResponse(exception,errorMessage,HttpStatus.INTERNAL_SERVER_ERROR,request);
    }



    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleDataIntegrityViolationException(
            DataIntegrityViolationException dataIntegrityViolationException,
            WebRequest request){
        String errorMessage = dataIntegrityViolationException.getMostSpecificCause().getMessage();
        log.error("Failed to save entity with integrity problems: "+ errorMessage, dataIntegrityViolationException);
        return buildErrorResponse(
                dataIntegrityViolationException,
                errorMessage,
                HttpStatus.CONFLICT,
                request);
    }

    @ExceptionHandler(ObjectNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleObjectNotFoundException(
        ObjectNotFoundException objectNotFoundException,
        WebRequest request){
        log.error("Failed to find the request element", objectNotFoundException);
        return buildErrorResponse(
                objectNotFoundException,
                HttpStatus.NOT_FOUND,
                request
        );
    }

    @ExceptionHandler(DataBindindViolationException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleDataBindindViolationException(
            DataBindindViolationException dataBindindViolationException,
            WebRequest request){
        log.error("Failed to delete the request element", dataBindindViolationException);
        return buildErrorResponse(
                dataBindindViolationException,
                HttpStatus.NOT_FOUND,
                request
        );
    }


    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<Object> handleConstraintViolationException(
            ConstraintViolationException constraintViolationException, WebRequest request)
    {
        log.error("Failed to validate element", constraintViolationException);
        return buildErrorResponse(constraintViolationException,HttpStatus.UNPROCESSABLE_ENTITY,
                request);

    }

    //Captura qualquer método de exceção
    @Override
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
             MethodArgumentNotValidException ex,
             HttpHeaders headers,
             HttpStatus status,
             WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.UNPROCESSABLE_ENTITY.value(),"Validation error. Check 'erros' field for details");
        for(FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            errorResponse.addValidationError(fieldError.getField(),fieldError.getDefaultMessage());
        }
        return ResponseEntity.unprocessableEntity().body(errorResponse);
    }





    private ResponseEntity<Object> buildErrorResponse
            (Exception exception, String errorMessage, HttpStatus status, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(status.value(),errorMessage);
        if(this.printStackStrace) {
            errorResponse.setStackTrace(ExceptionUtils.getStackTrace(exception));
        }
        return  ResponseEntity.status(status).body(errorResponse);
    }
    private ResponseEntity<Object> buildErrorResponse(
            Exception exception,
            HttpStatus httpStatus,
            WebRequest request){
        return buildErrorResponse(exception,exception.getMessage(),httpStatus,request);
    }


}
