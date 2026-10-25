package day03_controlstatements;
import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();

		if(age>=18) {
			System.out.println("Do you have a valid ID(Yes/No)");
			String hasid=sc.next();
			if(hasid.equalsIgnoreCase("Yes")) {
				System.out.println("You are eligible to vote");	
			}
			else {
				System.out.println("You are Not eligible to vote(id req)");	
			}
		}
	    else {
	    	System.out.println("You are Not eligible to vote(must be 18+");	
			}
		sc.close();
	}

}
