package day03_controlstatements;
import java.util.Scanner;
public class VowelConsonantUsingSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			char choice=sc.next().charAt(0);
			switch(choice) {
			case 'A': case 'E': case 'I': case 'O': case 'U': 
			case 'a': case 'e': case 'i':case 'o': case 'u':
				System.out.println(choice+" is Vowel");
				break;
				default:
					System.out.println(choice+" is Consonant");
		}
			sc.close();
	}

}
