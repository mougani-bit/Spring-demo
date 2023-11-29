package fr.diginamic.demospring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class VilleException extends Exception {
    public VilleException(String message) {
        super(message);
    }

    @ControllerAdvice
    public static class GlobalExceptionHandler {

        @ExceptionHandler(VilleException.class)
        public ResponseEntity<String> handleVilleException(VilleException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }
}
