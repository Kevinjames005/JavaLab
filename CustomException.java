package p2;
import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String message) 
	{
		super(message);
	}
}

public class CustomException {
	public static void ValidateAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("Age must be at least 18 years old.");
		}
		System.out.println("Age is Valid: "+ age);
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eligibility test for custom votiing");
		System.out.println("Enter your ag:e");
		int age = sc.nextInt();
		
	
	try {
		ValidateAge(age);
	}
	catch(AgeException e){
		System.out.println("Error:"+e.getMessage());
		} 
	finally{
			System.out.println("I am finally block...I am always here...");
		}
	sc.close();
		
	}
	}
}

