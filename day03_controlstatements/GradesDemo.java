package day03_controlstatements;

public class GradesDemo {
	public static void main(String[] args) {
		int marks=75;
		if(marks>=90 && marks<100) {
			System.out.println("Grade A");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("Grade B");
		}
		else if(marks>=60 && marks<80) {
			System.out.println("Grade C");
	    }
		else if(marks<35) {
			System.out.println("Fail");
		}

	}
}

