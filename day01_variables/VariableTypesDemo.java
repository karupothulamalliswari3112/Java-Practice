package day01_variables;

public class VariableTypesDemo {
	int instancevar;
	static boolean staticvar;

	public static void main(String[] args) {
		int localvar = 10;

		VariableTypesDemo obj = new VariableTypesDemo();

		System.out.println("Local Variable:" + localvar);
		System.out.println("Instance Variable:" + obj.instancevar);
		System.out.println("Static Variable:" + staticvar);

	}
}
