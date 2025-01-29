package VariabilaMetoda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateParser {
    public static void parseDate() throws ParseException {
        String date1 = "18 Jun 2015";
        String date2 = "18 June,2015";

        // Define input formatters based on input formats
        SimpleDateFormat inputFormatter1 = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        SimpleDateFormat inputFormatter2 = new SimpleDateFormat("dd MMMM,yyyy", Locale.ENGLISH);

        // Define the desired output format
        SimpleDateFormat outputFormatter = new SimpleDateFormat("EEE MMM dd yyyy", Locale.ENGLISH);

        // Parse input strings to Date objects
        Date parsedDate1 = inputFormatter1.parse(date1);
        Date parsedDate2 = inputFormatter2.parse(date2);

        // Format Date objects to desired output format
        String formattedDate1 = outputFormatter.format(parsedDate1);
        String formattedDate2 = outputFormatter.format(parsedDate2);

        // Print the formatted dates
        System.out.println("Formatted date 1: " + formattedDate1);
        System.out.println("Formatted date 2: " + formattedDate2);
    }

    public static void main(String[] args) {
        try {
            parseDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
