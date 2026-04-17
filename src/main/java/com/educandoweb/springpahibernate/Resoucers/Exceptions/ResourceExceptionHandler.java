package com.educandoweb.springpahibernate.Resoucers.Exceptions;

import javax.management.relation.RelationNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.springpahibernate.Services.Exception.DataBaseException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(RelationNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(RelationNotFoundException e, HttpServletRequest request){
        StandardError err = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);//O metodo vai interceptar a exceção RelationNotFoundException, criar um objeto StandardError com as informações relevantes e retornar uma resposta HTTP 404 Not Found com o objeto de erro no corpo da resposta.
    }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardError> databaseError(DataBaseException e, HttpServletRequest request){
        StandardError err = new StandardError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), "Erro de banco de dados", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
}
