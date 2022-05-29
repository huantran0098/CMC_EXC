package BackEnd.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.FileNotFoundException;

@ControllerAdvice
public class HandlerExceptionClass extends Exception{

    @ExceptionHandler(FileNotFoundException.class)
    public ResponseEntity<?> InCorrectId(String errorMessage){
        return new ResponseEntity<>("ID Not found, please enter another ID!", HttpStatus.NOT_FOUND);
    }
}
