package com.virtusa.checked_exception_wrap;

import com.virtusa.exception.NoFileException;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AnomalyDetection {

   public void logAnomaly(){
       try {
           FileWriter myWriter = new FileWriter("C:/Rishan/Anomaly.txt");
           myWriter.write("Anomaly detected "+ LocalDateTime.now());
           myWriter.close();
       } catch (IOException e) {
           throw new NoFileException("Log file cannot be found",e);
       }
   }
}
