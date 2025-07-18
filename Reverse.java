/**Author: Hans Tom Sojan
 * Date:18-07-2025
 * Write a Java program to print the reverse of a given number using a for loop.
 */
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        int reverse=0;
        for(int i=num;i>0;i=i/10)
        {
            reverse=reverse*10+i%10;
        }
        System.out.println("The reversed number = "+reverse);
        in.close();
    }
}
