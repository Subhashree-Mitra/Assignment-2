package asn1;
import java.util.*;

class Customers{
	String name;
	String contact;
	String email;
	String address;
	String gender;
	
	public void placeOrder() {
		System.out.println(name + " has placed order");
	}
	
	public void logIn() {
		System.out.println(name + " just logged in");
	}
}

class Product{
	String name;
	String id;
	String manufacturer;
	String origin;
	double price;
	
	public void usage() {
		System.out.println("This is the demo of how to use the product " + name);
	}
	
	public void order() {
		System.out.println("The product "+ name + " has been ordered and needs to be delivered within a week");
	}
	
}


public class asn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customers[] c = new Customers[2];
		
		Product[] p = new Product[2];
		
		for(int i=0; i<=1; i++) {
			System.out.println("Enter the information of customer: " + (i+1));
			c[i] = new Customers();
			System.out.println("Name: ");
			c[i].name = sc.nextLine();
			System.out.println("Contact: ");
			c[i].contact = sc.nextLine();
			System.out.println("Email: ");
			c[i].email = sc.nextLine();
			System.out.println("Address: ");
			c[i].address = sc.nextLine();
			System.out.println("Gender: ");
			c[i].gender = sc.nextLine();
		}
		
		for(int i=0; i<=1; i++) {
			System.out.println("Information about customer: " + (i+1));
			System.out.println("Name: " + c[i].name);
			System.out.println("Contact: " + c[i].contact);
			System.out.println("Email: " + c[i].email);
			System.out.println("Address: " + c[i].address);
			System.out.println("Gender: " + c[i].gender);
			System.out.println();
			
			System.out.println("Calling the modules of customers class: ");
			c[i].logIn();
			c[i].placeOrder();
			System.out.println();
			
		}
		
		for(int i=0; i<=1; i++) {
			System.out.println("Enter the information of product: " + (i+1));
			p[i] = new Product();
			System.out.println("Name: ");
			p[i].name = sc.nextLine();
			System.out.println("Id: ");
			p[i].id = sc.nextLine();
			System.out.println("Manufacturer: ");
			p[i].manufacturer = sc.nextLine();
			System.out.println("Origin: ");
			p[i].origin = sc.nextLine();
			System.out.println("Price: ");
			p[i].price = sc.nextDouble();
			sc.nextLine();
		}
		
		for(int i=0; i<=1; i++) {
			System.out.println("Information about product: " + (i+1));
			System.out.println("Name: " + p[i].name);
			System.out.println("Id: " + p[i].id);
			System.out.println("Manufacturer: " + p[i].manufacturer);
			System.out.println("Origin: " + p[i].origin);
			System.out.println("Price: " + p[i].price);
			System.out.println();
			
			System.out.println("Calling the modules of product class: ");
			p[i].usage();
			p[i].order();
			System.out.println();
			
		}
		
		
	}

}
