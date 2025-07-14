import java.util.*;
public class attendance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name");
        String name=in.nextLine();
        System.out.println("Enter age");
        int age=in.nextInt();
        System.out.println("Enter Mobile Number");
        long mobileNumber=in.nextLong();
        System.out.println("Enter CGPA");
        double cgpa=in.nextDouble();
        System.out.println("Enter attendance percentage");
        float attendance=in.nextFloat();
        System.out.println("Full Name: " +name);
        System.out.println("Age:\t\t"+age);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("CGPA:\t"+cgpa);
        if(attendance>=90)
            System.out.println("Attendance Mark: 10");
        else
            System.out.println("Attendance Mark:"+attendance/10 );    
    }
}
