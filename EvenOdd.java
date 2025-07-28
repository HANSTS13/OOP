/**Author: Hans Tom Sojan
 * Date:25-07-2025
 * Count the number of even and odd elements in the array of n integers entered by
the user
 */
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int[] num=new int[n];
        int even=0,odd=0;
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
            if(num[i]%2==0)
                even++;
            else    
                odd++;
        }    
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);
        in.close();
    }
}
