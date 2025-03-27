package Day_04;

class Employee{
	
	int employeeId;
	String name;
	double salary;
	
	
	Employee(int employeeId, String name, double salary){
		
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee ID: "+employeeId+" Employee Name: "+name+" Employee Salary: "+salary);
	}
}

class Manager extends Employee{
	
	double bonus;
	
	
	Manager(int employeeId, String name, double salary, double bonus){
		super(employeeId, name, salary);
		this.bonus=bonus;
	}
	
	void TotalSalary() {
		double total;
		total=salary+bonus;
		System.out.println("Total Salary: "+total);
	}
	
}

class Developer extends Employee{
	
	String Planguage;
	Developer(int employeeId, String name, double salary, String Planguage){
		super(employeeId, name, salary);
		this.Planguage=Planguage;
	}
	
	public void Language() {
		System.out.println("Expert is: "+Planguage);
	}
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Developer d = new Developer(1, "Harsh", 2000, "Java");
		Manager m = new Manager(2, "Sarwade", 800, 100);
		d.displayDetails();
		d.Language();
		
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		m.displayDetails();
		m.TotalSalary();
		
	}
}
