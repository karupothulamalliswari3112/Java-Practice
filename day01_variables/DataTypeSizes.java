package day01_variables;

public class DataTypeSizes {
	public static void main(String[] args) {
		byte b=100;
		short s=100;
		int i=100;
		long l=100;
		System.out.println("Value of byte:"+b+", Size:"+Byte.BYTES+" bytes");
		System.out.println("Value of short:"+s+", Size:"+Short.BYTES+" bytes");
		System.out.println("Value of integer:"+i+", Size:"+Integer.BYTES+" bytes");
		System.out.println("Value of long:"+l+", Size:"+Long.BYTES+" bytes");
		
		// to find range we use this 
		System.out.println("Integer min value:"+Integer.MIN_VALUE );
		System.out.println("Integer max value:"+Integer.MAX_VALUE );

	}
}
