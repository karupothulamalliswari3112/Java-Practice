package day05_arrays;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] arr= {13,435,213,34,45};
		System.out.println("Original Array:");
		for(int x:arr) {
		System.out.print(x+" ");
	}
		Arrays.sort(arr);
		System.out.println("\nSorted Array:");
		for(int x:arr) {
			
			System.out.print(x+" ");
		}
	}
}


