/**Author: Hans Tom Sojan
 * Date:18-07-2025
 Write a Java program to find the greatest common divisor (GCD) of two numbers using a
while looр.
 */
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNum = in.nextInt();
        System.out.println("Enter the second number:");
        int secondNum= in.nextInt();
        int x= firstNum;
        int y= secondNum;
        int temp=0;
        while(y!=0){
            temp=y;
            y=x%y;
            x=temp;
        }
        System.out.println("The GCD of " +firstNum+ " and " +secondNum+ " is " + x);
        in.close();
    }
}
