package com.virtusa;

import com.virtusa.checked_exception.MovieTicket;
import com.virtusa.checked_exception_wrap.AnomalyDetection;
import com.virtusa.exception.NoConnectionException;
import com.virtusa.exception.TransactionAbortedException;
import com.virtusa.procurement.Requisition;
import com.virtusa.unchecked_exception.DayCountDown;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        AnomalyDetection anomalyDetection=new AnomalyDetection();
        MovieTicket movieTicket=new MovieTicket();
        DayCountDown dayCountDown=new DayCountDown();
        Requisition requisition=new Requisition();

        //Wrapping checked Exception within Unchecked Exception
        anomalyDetection.logAnomaly();

        //Checked Exception
        try {
            movieTicket.bookTicket();
        } catch (NoConnectionException e) {
            System.err.println("Ensure system is connected to the internet");
        }

        //Unchecked Exception
        System.out.print("Enter future date to countdown with date format->(dd-mm-yyyy) : ");
        String targetDate=scanner.next();
        long remainingDays=dayCountDown.countdown(targetDate);

        System.out.println(remainingDays+"days Remaining until "+targetDate);


        //Demonstrating 4 level StackTrace
        try {
            requisition.createRequisition();
        } catch (TransactionAbortedException e) {
            e.printStackTrace();
        }
    }
}
