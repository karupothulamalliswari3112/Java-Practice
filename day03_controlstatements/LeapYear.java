package day03_controlstatements;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int Year=sc.nextInt();
		if(Year % 400==0) {
			System.out.println(Year+" is Leap Year");
		}
		else if(Year % 100==0) {
			System.out.println(Year +" is Not a Leap Year");
		}
		else if(Year % 4==0) {
			System.out.println(Year+ " is Leap Year");
		}
		else {
			System.out.println(Year+ " is Not a Leap Year");
		}
	
	sc.close();
	}
}
