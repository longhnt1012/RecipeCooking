/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myLibrary;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author truc0
 */
public class myLibrary {
    public static Date parseDate(String dateString) {
        //String dateString = "2023-06-27";
        String formatPattern = "yyyy-MM-dd";
        
        SimpleDateFormat formatter = new SimpleDateFormat(formatPattern);
        Date date = new Date();
        try {
            date = formatter.parse(dateString);
//            String formattedDate = formatter.format(date);
//            System.out.println("Parsed Date: " + date.toString());
        } catch (ParseException e) {
            System.out.println("Error occurred while parsing the date string.");
            e.printStackTrace();
        }
        return date;
    }
    
}
