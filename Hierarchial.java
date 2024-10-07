package p2;
import java.util.Scanner;

class Employee{
	String name, address ,department;
	int age, salary;
	long ph;
	
	Employee(String name1 ,int age1,long ph1 ,String address1,int salary1){
		name=name1;
		age=age1;
		ph = ph1;
		address=address1;
		salary = salary1;
		
	}
	void employeedetails() {
		System.out.println("Name:"+ name );
		System.out.println("Address:"+ address );
		System.out.println("Age:"+ age );
		System.out.println("Phone number:"+ ph );
		
	}
	void printSalary(){
		System.out.println("Salary is "+salary);
	}
}
class Officer extends Employee
{
	String specialization;
	Officer(String name1 , int age1, long ph1, String address1 ,int salary1 ,String specialization1){
		super(name1, age1,ph1,address1,salary1);
	    specialization = specialization1;
	}
	
	void printSpecialization() {
		
		System.out.println("Specialization:"+specialization);
	}
}
class Manager extends Employee{
		String department;
		Manager(String name1 , int age1, long ph1, String address1 ,int salary1 ,String department1){
			super(name1, age1,ph1,address1,salary1);
			department = department1;
		}
		
		void printdepartment() {
			System.out.println("The Department is :"+department);
		}
	}
	


public class Hierarchial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Name , Address , Department , Specialization;
		int Age , Salary;
		long Ph;
		System.out.println("Enter the details of the Officer");
		System.out.println("Enter the officer's name:");
		Name= input.next();
		System.out.println("Enter the officer's address:");
		 Address = input.next();
		System.out.println("Enter the officer's age:");
		Age = input.nextInt();
		System.out.println("Enter the officer's phone:");
		Ph = input.nextInt();
		System.out.println("Enter the officer's salary:");
		Salary = input.nextInt();
		System.out.println("Enter the officer's specialization:");
		Specialization = input.next();
		
		
		Officer off = new Officer(Name, Age, Ph, Address,Salary, Specialization);
		off.employeedetails();
		off.printSalary();
		off.printSpecialization();
		
		System.out.println("\nEnter the details of the Manager");
		System.out.println("Enter the Manager's name:");
		 Name = input.next();
		System.out.println("Enter the  Manager'saddress:");
		Address = input.next();
		System.out.println("Enter the Manager's age:");
		Age = input.nextInt();
		System.out.println("Enter the Manager's phone:");
		Ph = input.nextInt();
		System.out.println("Enter the Manager's salary:");
		Salary = input.nextInt();
		System.out.println("Enter the Manager's Department:");
		Department = input.next();
		Manager mn = new Manager(Name, Age, Ph, Address,Salary, Department);
		
	    
		
		mn.employeedetails();
		mn.printSalary();
		mn.printdepartment();
		input.close();
	


	}

}
