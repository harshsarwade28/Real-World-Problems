package Day_02;

import java.util.*;
class Students{
	int id;
	String name;
	String course;
	
	Students(int id, String name, String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	public void displayDetails() {
		System.out.println(id+" "+name+" "+course);
	}
	
}

class InternationalStudent extends Students{
	
	String country;

	InternationalStudent (int id, String name, String course, String country){
		super(id, name, course);
		this.country=country;
	}
	
	public void displayDetails() {
		System.out.println(id+" "+name+" "+course+" "+country);
	}
}
public class UniversityAdmissionSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Students[] s = new Students[2];
		
		for(int i=0; i<2; i++) {
			
			System.out.println( (i+1) );
			
			System.out.println("Enter Students ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter Course: ");
			String course = sc.next();
			
			System.out.println("Is student is internation ? (Yes/No)");
			String InternationalStudent=sc.next();
			
			if(InternationalStudent.equalsIgnoreCase("Yes")) 
			{
				System.out.println("Enter COuntry");
				String country = sc.next();
				s[i]= new InternationalStudent(id, name, course, country);
			}
			else {
				s[i]= new Students(id, name, course);
			}

			System.out.println("Students Details:  ");
			s[i].displayDetails();
			System.out.println();
		}
		
	}
}
