package Day_01;

import java.util.*;
class Employee{
	
	int empId;
	String name;
	private double salary;
	
	
	Employee(int empId, String name, double salary){
		
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public void setSalary(double sal) {
		
		salary=sal;
	}
	
	public double getSalary() {
		return salary;
	}
	
	void display () {
		
		System.out.println();
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("=============================");
	}
}

public class BasicSalaryCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] e = new Employee[2];
		
		for(int i=0; i<2; i++) {
			
			System.out.println(i+1);
			System.out.println("Employee ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter Salary: ");
			int salary = sc.nextInt();
			
			e[i] = new Employee(id, name, salary); 
		}
		
		
		for(Employee x:e) {
			x.display();
		}
		
	}
}
