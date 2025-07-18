import java.util.*;
public class grade {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter Name");
    String Name=in.nextLine();
    System.out.println("Enter Score");
    float score=in.nextFloat();
    String grade="";
    if(score>=90.0)
        grade="S";
     else if(score>=85)
        grade="A+";
     else if(score>=80)
        grade="A";
     else if(score>=75)
        grade="B+";
     else if(score>=70 )
        grade="B";
     else if(score>=65 )
        grade="C+";
     else if(score>=60 )
        grade="C";
     else if(score>=50 )
        grade="D";
     else if(score>=40 )
        grade="P";
     else if(score>-1)
        grade="F";
     else
     {
        System.out.println("Invalid Entry");
        grade="";
     }
    if(grade!="")
    {
        System.out.println("Name = "+Name);
        System.out.println("Score = "+score);
        System.out.println("Grade = "+grade);
    }    
  }
} 
