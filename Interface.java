package p2;

import java.util.Scanner;

interface Human{
	final int jobid = 1050;
	void learn(String str);
	void work();
}
interface Recruitment{
	void screening(int score);
}
class Programmerinterface implements Human , Recruitment{
	public void learn(String str) {
		System.out.println("My trained area:" + str);
	}
	public void work() {
		System.out.println("Selected to the role development");
		
	}
	public void screening(int score) {
		System.out.println("Test Score:" + score);
	}
}
public class Interface{
	public static void main(String[] args) {
		Programmerinterface trainee = new Programmerinterface();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your trained area:");
		String str = sc.nextLine();
		System.out.println("Enter your test Score:");
		int score = sc.nextInt();
		System.out.println("...About my Placement...");
		trainee.learn(str);
		trainee.screening(score);
		trainee.work();
		System.out.println("My job id is :"+ trainee.jobid);
		sc.close();
	}
	
}

