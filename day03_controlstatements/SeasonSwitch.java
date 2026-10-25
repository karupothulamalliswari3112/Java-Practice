package day03_controlstatements;
import java.util.Scanner;
public class SeasonSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month:");
		int month=sc.nextInt();
		switch(month) {
		case 3: case 4: case 5: case 6:
			System.out.println("Summer");
			break;
		case 7: case 8: case 9: case 10:
			System.out.println("Rainy");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("Winter");
			break;
			default:
				System.out.println("Invalid month");
		}
	
sc.close();
}
}