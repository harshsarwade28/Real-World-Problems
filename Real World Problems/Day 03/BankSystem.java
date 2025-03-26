package Day_03;

class BankAccount{
	
	int Accountnumber;
	String Accountname;
	double Accountbalance;
	
	BankAccount(int Accountnumber, String Accountname, double Accountbalance){
		
		this.Accountnumber=Accountnumber;
		this.Accountname=Accountname;
		this.Accountbalance=Accountbalance;
		
		System.out.println("Account Number: "+Accountnumber+" Account Name: "+Accountname+" Account Balance:  "+Accountbalance);
	}
	
	public void deposit(double amount) {
		
		 Accountbalance = Accountbalance + amount;
		 System.out.println("Balanace: "+amount);
	}
	
	public void deposit(double amount, String source) {
		
		Accountbalance = Accountbalance + amount;
		System.out.println("Balanace: "+amount+" From "+source);
		
	}
	
	void finalBalance() {
		System.out.println("Account Balance: "+Accountbalance);
	}
}
public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount(1, "Harsh", 1000);
		b.deposit(3000);
		b.finalBalance();
		
		BankAccount b1 = new BankAccount(1, "Shirish", 1000);
		b1.deposit(10000, " Business ");
		b1.finalBalance();
		
		
	}
}
