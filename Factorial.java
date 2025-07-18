/**Author: Hans Tom Sojan
 * Date:18-07-2025
 * Write a Java program to print the factorial of a given number using a while loop.
 */
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        if(num<0)
        {
            System.out.println("Enter a positive number");
        }
        else{
        long fact=1;
        int i=1;
        while(i<=num)
        {
            fact*=i;
            i++;
        }
        System.out.println("The factorial of the number "+num+" is "+fact);
    }
        in.close();
    }
}
