package day03_controlstatements;

public class LargestOfThree {
	public static void main(String[] args) {
		int a=70;
		int b=80;
		int c=90;
		if(a>b){
			if(a>c) {
			System.out.println("a="+a+" is Greater");
		}
		}
		else if(b>c) {
			System.out.println("b="+b+" is Greater");
		}
		else {
			System.out.println("c="+c+" is Greater");
		}
	}

}
