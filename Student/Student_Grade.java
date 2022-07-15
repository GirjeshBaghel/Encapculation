package Encapsulation;


public class Student_Grade extends Student_Details {	

	// private variables 
	private float per;
	private char grade;
	private String result;
	
	// getter or setter methods of private variables
	 public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	// display method
	void display()
	 {
		// cal to percentage
		per = total/5;
		
		// passing the grade 
		if(per>90 )
		{
			grade = 'A';
		}
		else if(per<90 && per>80)
		{
			grade = 'B';
		}
		else if(per<80 && per >70)
		{
			grade='C';
					
		}		
		else if(per<60 && per >50) 
			grade = 'D';
		else 
			grade = 'E';
		
		// checking tha result
		if(total<170)
		{
			result = "False";
			
		}
		
		else result = "Pass";
		
		// printing the all data
		System.out.println("\nName : "+name);
		System.out.println("Total Marks : "+total+"/500");
		 System.out.println("Percentage : "+getPer());
		 System.out.println("Grade : "+getGrade());
		 System.out.println("Result : "+getResult());
		 
		 
	 }
	
	// main method 
	public static void main(String[] args) {
		Student_Grade ob = new Student_Grade();
		// calling method 
		ob.details();
		ob.display();
		

	}

}
