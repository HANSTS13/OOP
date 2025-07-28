/**Author: Hans Tom Sojan
 * Date:25-07-2025
 * Search for a number in the array and print its position if found, or a message if not
found.
 */
import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int[] num=new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        System.out.println("Enter the number to be searched");
        int number=in.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(num[i]==number)
            {
                flag=1;
                System.out.println("The number is found in the position "+(i+1));
                break;
            }
        }
        if(flag==0)
            System.out.println("The number is not found");
        in.close();
    }
}
