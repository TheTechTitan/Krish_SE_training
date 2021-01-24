package com.virtusa.exception;

public class UnprocessedMaterialException extends RuntimeException{

    public UnprocessedMaterialException(String message){
        super(message);
    }

    public UnprocessedMaterialException(String message,Exception exception){
        super(message,exception);
    }
}
