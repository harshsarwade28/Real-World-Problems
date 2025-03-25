package Day_01;

import java.util.*;

class Students {

	int id;
	String name;
	int age;
	
	Students(int id, String name, int age){
		
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void displayDetails() {
		
		System.out.println();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("-------------------------");
	}
}

public class BasicStudentManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Students[] stu = new Students[2];
		
		for(int i=0; i<2; i++) {
			
			System.out.println(i+1);
			
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			
			stu[i] = new Students(id, name, age);
		}
		
		for(Students x:stu) {
			x.displayDetails();
		}
	}
}
