package module1;
import java.util.*;
class Circle{
	double radius;
	Circle(double radius){
		this.radius= radius;
	}
	void area() {
		System.out.println("Area = "+(3.14*radius*radius));
	}
	void circumference() {
		System.out.println("Circumference = "+(3.14*2*radius));
	}
}
public class CIrcleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius=in.nextDouble();
		Circle c1= new Circle(radius);
		c1.area();
		c1.circumference();
		in.close();
	}

}
