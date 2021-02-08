package com.infinity.checked_exception;


import com.infinity.exception.NoConnectionException;

public class MovieTicket {

    public void bookTicket() throws NoConnectionException {

        //Implementation
        //Connection Interrupted
        throw new NoConnectionException("Connection interrupted while processing transaction");

    }
}
