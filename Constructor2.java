package module1;
import java.util.*;
class Books{
	String title, author;double price;
	Books(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetail(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : Rs."+price);
	}
}
public class BooksDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Title, Author and Price of first book");
		String title1=in.nextLine();
		String author1=in.nextLine();
		double price1=in.nextDouble();
		in.nextLine();
		Books b1= new Books(title1,author1,price1);
		System.out.println("Enter Title, Author and Price of second book");
		String title2=in.nextLine();
		String author2=in.nextLine();
		double price2=in.nextDouble();
		in.nextLine();
		Books b2= new Books(title2,author2,price2);
		b1.displayDetail();
		b2.displayDetail();
		in.close();
	}
}
