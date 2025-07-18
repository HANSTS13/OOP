    /**Author: Hans Tom Sojan
     * Date:18-07-2025
     Write a Java program to check if a given year is a leap year or not using if-else statements.
    */
    import java.util.*;
    public class Leap {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);   
            System.out.println("Enter a year");
            int year =in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a leap year");
            } else {
                System.out.println("The year " + year + " is not a leap year");
            }
            in.close();
        }
    }
