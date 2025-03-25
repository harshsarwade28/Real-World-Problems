package Day_01;

import java.util.*;
class Student {

	String name;
	int age;
	double m1;
	double m2;
	double m3;

	Student(String name, int age, double m1, double m2, double m3) {
		this.name = name;
		this.age = age;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	double avgDisplay() {
		return (m1 + m2 + m3) / 3;
	}

	 String PassOrFail() {

		return  avgDisplay() >= 40? "Pass" : "Fail";
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Average: " + avgDisplay());
		System.out.println("Result: "+PassOrFail());
	}
}

public class StudentResultManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		double m1 = sc.nextDouble();
		double m2=sc.nextDouble();
		double m3 = sc.nextDouble();
		
		Student s = new Student(name, age, m1, m2, m3);
		s.display();
	}
}
