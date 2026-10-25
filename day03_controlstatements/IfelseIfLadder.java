
package day03_controlstatements;
import java.util.Scanner;

public class IfelseIfLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		if(a==0) {
			System.out.println("equals to "+ a);
		}
		else if(a>0){
			System.out.println(a+" is Positive");
		}
		else {
			System.out.println(a+" is Negative");
		}
     sc.close();
	}
}
