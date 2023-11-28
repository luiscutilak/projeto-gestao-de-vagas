package br.com.luiscutilak.gestao_vagas.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public void handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        e.getBindingResult().getFieldErrors().forEach(err -> { // fazendo tratamento dos erros
            String message = messageSource.getMessage
        });
    }
}
