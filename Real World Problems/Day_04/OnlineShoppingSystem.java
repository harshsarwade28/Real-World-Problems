package Day_04;


class Products{
	
	int productId;
	String name;
	double price;
	
	Products(int productId, String name, double price){
		
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	
	public void displayDetails() {
		System.out.println("Product ID: "+productId+" Product Name: "+name+" Product Price: "+price);
	}
}

class Electronics extends Products{

	Electronics(int productId, String name, double price) {
		super(productId, name, price);
		
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Warrenty: 1yr..");
	}
	
	
}

class CLothing extends Products{
	
	CLothing(int productId, String name, double price){
		super(productId, name, price);
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Material: Cotton..");
	}
	
}
public class OnlineShoppingSystem {

	public static void main(String[] args) {
		CLothing c = new CLothing(1, "PANT", 1000);
		Electronics e = new Electronics(2, "MOBILE", 30000);
		c.displayDetails();
		e.displayDetails();
		
	}
}
