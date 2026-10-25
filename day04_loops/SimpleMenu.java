package day04_loops;
import java.util.*;
public class SimpleMenu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1.addition");	
			System.out.println("2.subtraction");	
			System.out.println("3.Exit");	
	        System.out.println("Enter your choice:");
		    choice=sc.nextInt();
		   switch(choice) {
		case 1:
			System.out.println("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition:"+(a+b));
			break;
		case 2:
			System.out.println("Enter two numbers:");
			int a1=sc.nextInt();
			int b1=sc.nextInt();
			System.out.println("Subtraction:"+(a1-b1));
			break;
		case 3:
			System.out.println("Existing.");
			break;
		default:
			System.out.println("Invalid choice!");
		}
		}
		  while(choice != 3);
		
	sc.close();
}
}
