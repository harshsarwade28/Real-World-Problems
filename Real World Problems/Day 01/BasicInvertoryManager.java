package Day_01;

import java.util.*;

class Products{
	
	int productId;
	String productName;
	double price;
	int quantity;
	
	Products(int productId, String productName){
		this.productId=productId;
		this.productName=productName;
	}
	
	Products(int productId, String productName, double price, int quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	void displayProductDetails() {
		
//		System.out.println("Product ID: "+productId);
//		System.out.println("Product Name: "+productName);
//		System.out.println("Product Price"+price);
//		System.out.println("Product Quantity: "+quantity);
		
		System.out.println(productId+" "+productName+" "+price+" "+quantity);
	}
	
}
public class BasicInvertoryManager {

	public static void main(String[] args) {
		
		
		Products p1 = new Products(101, "Harsh");
		Products p2 = new Products(101, "Harsh", 10000, 1);
		
		p1.displayProductDetails();
		p2.displayProductDetails();
		
	}
}
