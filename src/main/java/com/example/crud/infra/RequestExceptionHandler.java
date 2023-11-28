package com.example.crud.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RequestExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threat404(){
       // var responde = new ExceptionDTO("Dado não encontrado");
        return ResponseEntity.badRequest().body("Dado não encontrado");
    }

}
