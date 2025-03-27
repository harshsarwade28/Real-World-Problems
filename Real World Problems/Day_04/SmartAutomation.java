package Day_04;

abstract class SmartDevice{
	
	int deviceId;
	String deviceName;
	
	SmartDevice(int deviceId, String deviceName){
		
		this.deviceId=deviceId;
		this.deviceName=deviceName;
		
		
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	
}

class SmartLight extends SmartDevice{

	SmartLight(int deviceId, String deviceName){
		super(deviceId, deviceName);
		
		System.out.println("");
	}

	@Override
	public void turnOn() {
		System.out.println("TURN ON: "+deviceName+" "+deviceId);
		
	}

	@Override
	public void turnOff() {
		System.out.println("TURN OFF: "+deviceName+" "+deviceId);
	}
	
	
}

class SmartFan extends SmartDevice{
	
	SmartFan(int deviceId, String deviceName){
		super(deviceId, deviceName);
	}
	
	public void turnOn() {
		System.out.println("TURN ON: "+deviceName+" "+deviceId);
	}
	
	public void turnOff() {
		System.out.println("TURN OFF: "+deviceName+" "+deviceId);
	}
}
public class SmartAutomation {

	public static void main(String[] args) {
		
		SmartFan fan = new SmartFan(101, "Leaving Room FAN");
		fan.turnOn();
		fan.turnOff();
		
		SmartLight light = new SmartLight(102, "Bed Room LIGHT");

		light.turnOn();
		light.turnOff();
	}
}
