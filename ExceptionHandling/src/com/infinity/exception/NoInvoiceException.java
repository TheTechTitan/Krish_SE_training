package com.infinity.exception;

public class NoInvoiceException extends RuntimeException{

    public NoInvoiceException(String message){
        super(message);
    }

    public NoInvoiceException(String message,Exception exception){
        super(message,exception);
    }
}
