package Day_02;


class Product{
	
	private int id;
	private String name;
	private int price;
	private int quantity;
	
	Product(int id, String name, int price, int quantity){
		
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
}

public class ShoppingCartSystem {

	public static void main(String[] args) {
		
		Product p = new Product(101, "Mobile", 40000, 2);
		p.setQuantity(3);
		
		System.out.println("Product ID: "+p.getId());
		System.out.println("Product Name: "+p.getName());
		System.out.println("Product Price: "+p.getPrice());
		System.out.println("Product Quantity: "+p.getQuantity());
		
	}
}
