package day01_variables;

public class BooleanFlipDemo {
	public static void main(String[] args) {
		boolean flag=true;
		if(flag) {
			System.out.println("flag is True (default behaviour)");
		}
		else {
			System.out.println("flag is False (default behaviour)");
		}
		
		flag=!flag;
		if(flag) {
			System.out.println("flag is True (After Flip)");
		}
		else {
			System.out.println("flag is False (After Flip)");
		}

			}
	}


