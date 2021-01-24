package com.virtusa.exception;

public class TransactionAbortedException extends RuntimeException{


    public TransactionAbortedException(String message){
        super(message);
    }

    public TransactionAbortedException(String message,Exception exception){
        super(message,exception);
    }
}
