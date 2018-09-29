package basicjava;

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Please Enter year:");
        Scanner src = new Scanner (System.in);
        int year = src.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");
    }
}
