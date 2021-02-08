package com.infinity.exception;

public class NoFileException extends RuntimeException {

    private static final long serialVersionUID=1L;

    public NoFileException(String message){
        super(message);
    }

    public NoFileException(String message,Exception exception){
        super(message,exception);
    }
}
