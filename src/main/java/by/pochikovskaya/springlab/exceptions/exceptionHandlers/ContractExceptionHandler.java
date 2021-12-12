package by.pochikovskaya.springlab.exceptions.exceptionHandlers;


import by.pochikovskaya.springlab.exceptions.ContractException;
import by.pochikovskaya.springlab.exceptions.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class ContractExceptionHandler {

    @ExceptionHandler(ContractException.class)
    public ResponseEntity<Object> handleControllerException(
            ContractException ex, WebRequest request) {
        return new ResponseEntity<>(new ErrorDto(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
