package day02_operators;

public class IncrementDemo {
	public static void main(String[] args) {
		int a=5; //Initial value
		System.out.println("Initial value:"+a);
		
		System.out.println("Using Post-Increment:"+(a++)); //first use then increment
		System.out.println("After Post-Increment:"+a);
		 
	     a=5; //Resetting a for clarity
		
		System.out.println("Using Pre-Increment:"+(++a)); //first increment then use
		System.out.println("After Pre-Increment:"+a);
		
		
		
	}

}
