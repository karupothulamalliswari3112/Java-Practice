package day04_loops;

public class Divisibleby5and7 {
	public static void main(String[] args) {
		for(int i=1;i<=200;i++) {
			if(i%5==0 && i%7==0) {
				System.out.println("First number divisible by 5 & 7:"+i);
				break;
			
				
			}
		}
	}

}
