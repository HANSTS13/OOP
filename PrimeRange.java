/**Author: Hans Tom Sojan
 * Date:18-07-2025
 * Write a Java program to print all prime numbers between 1 and 100 using a for loop and ifelse statements.
 */
public class PrimeRange {
    public static void main(String[] args) {
    int flag=0;
    for(int i=2;i<=100;i++)
    {
      for(int j=2;j<=(i/2);j++)
      {
        if(i%j==0)
        {
            flag=1;
            break;
        }
      }
      if(flag==0)
            System.out.print(i+" ");
      flag=0;
    }
      }
    }
