package com.educandoweb.springpahibernate.Services.Exception;

public class ResouseNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResouseNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
    
}
