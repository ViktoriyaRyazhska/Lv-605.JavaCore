package Lesson13;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Task3 {


    //Create method to validate date according to format "mm.dd.yy"
    public static void main(String[] args) {

       // LocalDate today = LocalDate.now();
        String today = "12.25.20";
        String today1 = "15.25.20";
        String today2 = "12.42.20";
        String today3 = "gfjfjhfjhg";
        VasyaValidator(today);
        VasyaValidator(today1);
        VasyaValidator(today2);
        VasyaValidator(today3);



      //  System.out.println("Today is : " + today);



   }
   public static boolean VasyaValidator(String input) {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
      try {
          LocalDate.parse(input, formatter);
          System.out.println("valid date");
          return true;

      }catch (DateTimeParseException e){
          System.err.println("invalid date");
      }catch (Exception i){
          i.printStackTrace();
      }
       return false;
   }

}



