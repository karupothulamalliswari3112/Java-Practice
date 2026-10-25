package day02_operators;
import java.util.Scanner;
public class LogicalDemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if(num >=10 && num <=50) {
			System.out.println(num+" in between 10 and 50(inclusive)");
		}
		else {
			System.out.println(num+" Not lies in between 10 and 50");
		}
		
		if(num < 10 || num > 50) {
			System.out.println(num+" is outside the range 10-50");
		}
		else {
			System.out.println(num+" is inside the range 10-50");
		}
	     
		boolean inrange= num >=10 && num <=50;
		if(!inrange) {
			System.out.println("Not in range:"+num);
		}
		else {
			System.out.println("Confirmed in range:"+num);
			
		}
	
		sc.close();	
	}
	}


