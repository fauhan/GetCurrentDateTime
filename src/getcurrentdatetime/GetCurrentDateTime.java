/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcurrentdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author fauhan.pugar
 */
public class GetCurrentDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Example 1: Get Current date and time in default format
        LocalDateTime current1 = LocalDateTime.now();
        System.out.println("Current Date and Time is: " + current1);
        
        // Example 2: Get Current date and time with pattern
        LocalDateTime current2 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted2 = current2.format(formatter2);
        System.out.println("Current Date and Time is: " + formatted2);
        
        // Example 3: Get Current Date time using predefined constants
        LocalDateTime current3 = LocalDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted3 = current3.format(formatter3);
        System.out.println("Current Date is: " + formatted3);
        
        // Example 4: Get Current Date time in localized style
        LocalDateTime current4 = LocalDateTime.now();
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted4 = current4.format(formatter4);
        System.out.println("Current Date is: " + formatted4);
    }
    
}
