package Encapsulation;
class Student_Calling
{
	// main method
	public static void main(String[] args) {
		Student_Grade ob = new Student_Grade();
		// calling method 
		ob.details();
		ob.display();
		//printing statement
		System.out.println("Percentage : "+ob.getPer());
		System.out.println("Grade : "+ob.getGrade());
		System.out.println("Result : "+ob.getResult());
		

	}
}
