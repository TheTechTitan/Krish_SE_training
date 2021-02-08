package com.infinity.exception;

public class NoConnectionException extends Exception{

    private static final long serialVersionUID=1L;

    public NoConnectionException(String message){
        super(message);
    }
    public NoConnectionException(String message, Exception exception){
        super(message,exception);
    }
}
