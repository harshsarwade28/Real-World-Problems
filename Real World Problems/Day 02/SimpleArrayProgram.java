package Day_02;

import java.util.*;

public class SimpleArrayProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr= null;
		int size=0;		
		
			while(true) {
			
			  	System.out.println("Menu Driven Program:");
	            System.out.println("1. Enter array size and values");
	            System.out.println("2. Display array");
	            System.out.println("3. Sort by assending");
	            System.out.println("4. Sort by Descending");
	            System.out.println("5. Delete element");
	            System.out.println("6. Search element");
	            System.out.println("7. Find maximum");
	            System.out.println("8. Find minimum");
	            System.out.println("9. Sum & Average");
	            System.out.println("10. Enter element at specific array");
	            
	            System.out.println("11. Exit");
	            

		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Enter size of array: ");
			size = sc.nextInt();
			arr=new int[size];
			
			System.out.println("Enter elements now: ");
			for(int i=0; i<size; i++) 
			{
				System.out.println("Elemets: "+(i+1)+": ");
				arr[i]=sc.nextInt();
			}
			System.out.println("Elements inserted....");
			break;
			
		case 2:
	
			for(int num: arr) 
			{
				System.out.println(num);
			}
			break;
		case 3:
		
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr.length; j++) 
				{
					if(arr[i]<arr[j]) 
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int num: arr) 
			{
				System.out.println(num);
			}
			break;
		case 4:
			
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr.length; j++) 
				{
					if(arr[i]>arr[j]) 
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int num: arr) 
			{
				System.out.println(num);
			}
			break;
			
		case 5:
			
			System.out.println("Enter which number you want to delete: ");
			int delteNumber = sc.nextInt();
			boolean found = false;
			
			for(int i=0; i<size; i++) 
			{
				if(arr[i]==delteNumber) {
					arr[i]=0;
					found=true;
					System.out.println("Element deleted successfull...");
					break;
				}
				
			}
			
		case 6:
		
			System.out.println("Enter which number you want to search: ");
			int searchNumber = sc.nextInt();
			boolean search = false;
			
			for(int i=0; i<size; i++) 
			{
				if(arr[i]==searchNumber) {
					System.out.println("Element Found..."+arr[i]);
					found=true;
					
				}
				
			}
			break;
		case 7:
			int max=arr[0];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i]>max) {
						max=arr[i];
					}
				}
			}
			System.out.println(max);
			
		case 8:
			int min=arr[0];
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr.length; j++) 
				{
					if(arr[i]<min) 
					{
						min=arr[i];
					}
				}
			}
			System.out.println(min);
			break;
			
		case 9:
			int sum=0;
			
			for(int i=0; i<arr.length; i++)
			{
				sum=sum+arr[i];
				
			}
			System.out.println("Sum is: "+sum);
			int avg=sum/arr.length;
			System.out.println("Average is: "+avg);
			break;
			
		case 10:
			System.out.println("Enter index");
			int idx = sc.nextInt();
			System.out.println("Enter element ");
			int ele = sc.nextInt();
			arr[idx]=ele;
			System.out.println("Element insrted...");
			break;
			
		case 11:
			System.out.println("Exited....Start from SCRATCH now");
			break;
			
		default:
			System.out.println("Invalid entry..");
			}
		}
	}
}
