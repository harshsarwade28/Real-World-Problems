package Day_04;

interface PaymentGateway{
	
	public void processPayment(double amount);
	public void generateReceipt();
}

class CreditCardPayment implements PaymentGateway{
	
	String CardHolderName;
	int CardNumber;
	double FinalPayment;
	
	CreditCardPayment(String CardHolderName, int CardNumber){
		
		this.CardHolderName=CardHolderName;
		this.CardNumber=CardNumber;
	}
	
	@Override
	public void processPayment(double amount) {
		 FinalPayment=amount;
		System.out.println("Processing ₹ "+FinalPayment+" through Credit Card ( Holder Name "+ CardHolderName+" )");
		System.out.println("Payment Successful via Credit Card."+CardNumber);
		
	}

	@Override
	public void generateReceipt() {
	System.out.println("Receipt: ₹"+FinalPayment+" paid via Credit Card.");
		
	}
}

class PayPalPayment implements PaymentGateway{

	String email;
	double  FinalPayment;
	
	PayPalPayment(String email){
		this.email=email;
	}
	
	@Override
	public void processPayment(double amount) {
		 FinalPayment=amount;
		System.out.println("Processing ₹ "+FinalPayment+" through Credit Card ( Email "+ email+" )");
		System.out.println("Payment Successful via Credit Card.");
	}

	@Override
	public void generateReceipt() {
		
		System.out.println("Receipt: ₹"+FinalPayment+" paid via Credit Card.");
	}
	
}
public class PaymentProcessingSystem {

	public static void main(String[] args) {
		
		CreditCardPayment c = new CreditCardPayment("Harsh Sarwade", 123456);
		c.processPayment(500);
		c.generateReceipt();
		
		System.out.println();
		System.out.println("===================");
		System.out.println();
		
		PayPalPayment p = new PayPalPayment("harshsarwade@gmail.com");
		p.processPayment(200);
		p.generateReceipt();
	}
}
