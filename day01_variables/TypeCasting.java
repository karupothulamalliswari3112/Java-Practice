package day01_variables;

public class TypeCasting {

	public static void main(String[] args) {
		int a = 54;
		double b = a;
		System.out.println("----------Implicit-----------");
		System.out.println("Interger value:" + a);
		System.out.println("Double value:" + b);
		double c = 34.7;
		int d = (int) c;
		System.out.println("----------Explicit-----------");
		System.out.println("Double value:" + c);
		System.out.println("Interger value:" + d);

	}

}
