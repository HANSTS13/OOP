/**Author: Hans Tom Sojan
 * Date:25-07-2025
 * Sort the array elements in ascending order and display the sorted array.
 */
import java.util.*;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int[] num=new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        Arrays.sort(num);
        for(int i: num)
            System.out.print(i+" ");
        in.close();    
    }
}
