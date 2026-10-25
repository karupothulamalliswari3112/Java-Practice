package day05_arrays;

public class ReverseArray {
	public static void main(String[] atgs) {
		int[] arr= {23,24,45,21};
		System.out.println("Original Array:");
		for(int x:arr) {
		System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Reverse Array:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		
	}

	}
}
