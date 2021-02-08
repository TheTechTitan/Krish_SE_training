package com.infinity.exception;

public class CreditException extends RuntimeException{

    public CreditException(String message){
        super(message);
    }

    public CreditException(String message,Exception exception){
        super(message,exception);
    }
}
