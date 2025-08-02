package module1;
import java.util.*;
class Marks{
	double mark1,mark2,mark3;
	Marks(double m1,double m2,double m3){
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	double total() {
		return mark1+mark2+mark3;
	}
	double average() {
		return (mark1+mark2+mark3)/3.0;
	}
}
public class MarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks of the Student for 3 Subjects");
		double m1=in.nextDouble();
		double m2=in.nextDouble();
		double m3=in.nextDouble();
		Marks m= new Marks(m1,m2,m3);
		System.out.println("Total= "+m.total());
		System.out.println("Average= "+m.average());
		in.close();
	}
}
