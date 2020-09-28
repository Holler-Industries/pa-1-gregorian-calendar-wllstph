package com.example.project;
import java.util.*;
public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */
        GregorianCalendar CalendarTester = new GregorianCalendar();

       //current day
        System.out.println("The current date is: "+CalendarTester.get(Calendar.MONTH)+"/"+CalendarTester.get(Calendar.DATE)+"/"+CalendarTester.get(Calendar.YEAR));

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument
        System.out.println("The day of the week is: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 6");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.
        //month
        System.out.println("The month is: " + myCal.get(Calendar.MONTH));
        System.out.println("Expected: 8");
        //year
        System.out.println("The year is: " + myCal.get(Calendar.YEAR));
        System.out.println("Expected: 2020");
        //day of month
        System.out.println("The day of the month is: " + myCal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Expected: 25");

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html
        CalendarTester.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println("The current date, plus 100 days, is: "+CalendarTester.get(Calendar.MONTH)+"/"+CalendarTester.get(Calendar.DATE)+"/"+CalendarTester.get(Calendar.YEAR));
        System.out.println("The day of the week, plus 100 days, is: "+Calendar.DAY_OF_WEEK);

        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)
        GregorianCalendar myBirthday = new GregorianCalendar(2020, Calendar.OCTOBER, 5);
        myBirthday.add(Calendar.DAY_OF_YEAR,10000);
        System.out.println("The day of the week 10,000 days after my birthday is: "+myBirthday.get(Calendar.DAY_OF_WEEK));



    }

}