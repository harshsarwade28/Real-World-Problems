interface Payable{
	
	public void calculateSalary();
}

class Employee{
	
	int empId;
	String empName;
	
	Employee(int empId, String empName){
		
		this.empId=empId;
		this.empName=empName;
	}
}
class FullTime extends Employee implements Payable{
	
	double salary;
	
	FullTime(int empId, String empName, double salary){
		super(empId, empName);
		this.salary=salary;
	}
	
	@Override
	public void calculateSalary(){
		System.out.println("Employee ID: "+empId+" Employee Name: "+empName+" Employee Salary: "+salary);
	}
}
class PartTime extends Employee implements Payable{
	double hour;
	int wages;
	
	PartTime(int empId, String empName, double hour, int wages){
		super(empId, empName);
		this.hour=hour;
		this.wages=wages;
	}
	
	@Override
	public void calculateSalary(){
		double pay=hour*wages;
		System.out.println("Employee ID: "+empId+" Employee Salary: "+empName+ "Hours: "+hour+" Wages: "+wages);
	}
}
class EmployeeSalaryManagement{
	
	public static void main(String[] args){
		
		FullTime f = new FullTime(1, "Harsh", 5000);
		PartTime p = new PartTime(2, "Saidnya", 6, 800);
		
		((Payable) f).calculateSalary();
		((Payable) p).calculateSalary();
		
	}
}