/**Author: Hans Tom Sojan
 * Date:25-07-2025
 *Input n numbers and store them in an array. Then display the array elements in the
same order and in reverse order
 */
import java.util.*;
public class ArrayOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int[] num=new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        System.out.println("Same Order:");
        for(int i:num)
            System.out.print(i+" ");
        System.out.println("\nReverse Order:");
        for(int i=n-1;i>=0;i--)
             System.out.print(num[i]+" ");
        in.close();
            }
}
