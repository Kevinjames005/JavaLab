package p2;
import java.util.Scanner;
public class Exception{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		char confirmation;
		do {
		System.out.println("Enter tyhe choice:\n\t 1.Arithmetic Operation. \n\t 2. Array Access");
		choice = sc.nextInt();
		
		switch(choice){
		case 1:
		{
			try {
			System.out.println("Enter the numerator:");
			int numerator = sc.nextInt();
			System.out.println("Enter the denominator:");
			int denominator = sc.nextInt();
			int num = numerator/denominator;
			System.out.println("output="+num);
			}
			catch(ArithmeticException e) {
				System.out.println("Catch an exception:"+ e.getMessage());
			}
			break;
		}
		case 2:
		{
			try {
				
				int A[]= {1,2,3};
				System.out.println("Enter the Index position of the element:");
				int index = sc.nextInt();
				System.out.println("Element at the index position"+index+"-"+A[index]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught an exception"+ e.getMessage());
			}
			break;
		}
			
		default:
		{
			System.out.println("Invalid expression");
			break;
		}
		}
		System.out.println("Do you want to continue:\t Y or N");
		confirmation = sc.next().charAt(0);
	}
		while(confirmation == 'y'|| confirmation == 'Y');
		}
}

