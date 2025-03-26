package Day_03;

import java.util.*;


class Vehicle{
	
	int vehicleId;
	String model;
	double rentalPrice;
	static int totalVehiclesRented;
	
	Vehicle(int vehicleId, String model, double rentalPrice){
		
		this.vehicleId=vehicleId;
		this.model=model;
		this.rentalPrice=rentalPrice;
		totalVehiclesRented++;
		
		System.out.println("ID: "+vehicleId+" Mode: "+model+" Price: "+rentalPrice);
	}
	
	public static int getTotalVehiclesRented() {
		//int count=0;
		return totalVehiclesRented;
	}
}
public class VehicleRentedSystem {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle(1, "HONDA", 1000);
		Vehicle v1 = new Vehicle(1, "HONDA", 1000);
		Vehicle v2 = new Vehicle(1, "HONDA", 1000);
		Vehicle v3 = new Vehicle(1, "HONDA", 1000);
		System.out.println("Total Vehicles Rented are: "+Vehicle.getTotalVehiclesRented());
		
	}
}
