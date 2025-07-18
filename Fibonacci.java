/**Author: Hans Tom Sojan
 * Date:18-07-2025
 * Write a Java program to print the Fibonacci series up to a given number using a while loop.
 */
import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the maximum number for the Fibonacci series:");
        int limit = in.nextInt();
        int a = 0, b = 1,next=0;
        System.out.print("Fibonacci series up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        in.close();
    }
}
