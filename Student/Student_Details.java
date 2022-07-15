//WAP to Implement the EncapsulationAccept Student name,. Roll_no, Accept Marks of 5 SubjectCalculate the Grade and Percentage
package Encapsulation;

import java.util.Scanner;

// Student details class that carry student details only
public class Student_Details {
	// global variable
	int roll,hin,eng,math,sci,total,sst;
	String name;	
	Scanner sc = new Scanner(System.in);
	
	// details method that call by the another class
	void details()
	{
		// taking student name from user	
		System.out.println("Enter Student Details Here..");
		System.out.print("Name : ");
		name = sc.next();
		
		// taking student roll no from user
		System.out.print("Roll No : ");
		roll = sc.nextInt();
		
		// taking student marks from user
		System.out.println("Enter the Marks here.. ");
		System.out.print("Hindi : ");
		hin = sc.nextInt();		
		System.out.print("English : ");
		eng = sc.nextInt();
		System.out.print("Maths : ");
		math = sc.nextInt();
		System.out.print("Science : ");
		sci = sc.nextInt();
		System.out.print("SST : ");
		sst = sc.nextInt();
		
		
		// total marks calculate
		total = hin+eng+sci+sst+math;				
		
	}	
	
}
