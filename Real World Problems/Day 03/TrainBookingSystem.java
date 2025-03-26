package Day_03;
import java.util.*;

class Passengers{
	
	private int Id;
	private String name;
	private int age;
	
	
	Passengers(int Id, String name, int age){
		this.Id=Id;
		this.name=name;
		this.age=age;
	}
	
	public int getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "ID: "+Id+" Name: "+name+" Age: "+age;
	}
}

class Train{
	
	private int number;
	private String name;
	private List<Passengers> passengerList;
	
	Train(int number, String name){
		
		this.number=number;
		this.name=name;
		this.passengerList=new ArrayList<Passengers>();
	}
	
	public void addPassenger(Passengers p) {
		passengerList.add(p);
	}
	
	public void displayPassengers() {
		System.out.println("Train NUmber: "+number+" Train Name: "+name);
		System.out.println("Passenger are: ");
		
		int cnt=1;
		for(Passengers p:passengerList) {
			System.out.println(p);
		}
		cnt++;
	}
}
public class TrainBookingSystem {
	public static void main(String[] args) {
		
		Train t1 = new Train(123, "Shatabadi Express...");
		Passengers p1 = new Passengers(101, "Shivam", 56);
		Passengers p2 = new Passengers(101, "Shivam", 56);
		Passengers p3 = new Passengers(101, "Shivam", 56);
		Passengers p4 = new Passengers(101, "Shivam", 56);
		
		t1.addPassenger(p1);
		t1.addPassenger(p2);
		t1.addPassenger(p3);
		t1.addPassenger(p4);
		
		t1.displayPassengers();
	}
}
