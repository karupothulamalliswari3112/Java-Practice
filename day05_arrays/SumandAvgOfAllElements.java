package day05_arrays;

public class SumandAvgOfAllElements {
	public static void main(String[] args) {
		int[] arr= {12,4,65,33,24};
		int sum=0;
		int avg=0;
		for(int x:arr) {
			sum +=x;
			avg=sum/arr.length;
		}
			System.out.println("Sum:"+sum);
			System.out.println("Avg:"+avg);
	}

}
