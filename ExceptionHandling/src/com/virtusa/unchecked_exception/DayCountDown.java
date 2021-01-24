package com.virtusa.unchecked_exception;


import com.virtusa.exception.InvalidDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DayCountDown {

    private LocalDate localDateNow;
    private LocalDate localDateTarget;
    private long countDownDays;
    DateTimeFormatter dateTimeFormatter;

    public long countdown(String targetDate){

        dateTimeFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");

        localDateNow=LocalDate.now();

        try {
            localDateTarget = LocalDate.parse(targetDate, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            throw new InvalidDateException("Ensure the specified date format is correct",e);
        }
        countDownDays=ChronoUnit.DAYS.between(localDateNow,localDateTarget);

        return countDownDays;
    }
}
