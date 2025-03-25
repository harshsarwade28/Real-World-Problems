package Day_01;

class Vehicle{
	
	String vehicleNumber;
	String brand;
	double speed;
	String OwnerName;
	
	public void ShowDetails(String vehicleNumber, String brand, double speed) {
		
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.speed=speed;
		this.OwnerName=OwnerName;
		
		System.out.println(vehicleNumber+" "+brand+" "+speed);
	}
	
	public void WithSpeed(String vehicleNumber, String brand) {
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		
		System.out.println(vehicleNumber+" "+brand);
	}
	
	public void WithOwnerDetails(String vehicleNumber, String brand, String OwnerName) {
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.OwnerName=OwnerName;
		
		System.out.println(vehicleNumber+" "+brand+" "+OwnerName);
	}
}

public class BasicVehicleManagementSystem {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.ShowDetails("MH 3654", "Honda", 60);
		v.WithSpeed("MH 3654", "Honda");
		v.WithOwnerDetails("MH 3654", "Honda", "Harsh");
	}
}
