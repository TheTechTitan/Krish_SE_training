package com.infinity.exception;

public class InvalidDateException extends RuntimeException{

    private static final long serialVersionUID=1L;

    public InvalidDateException(String message){
        super(message);
    }
    public InvalidDateException(String message,Exception exception){
        super(message,exception);
    }
}
