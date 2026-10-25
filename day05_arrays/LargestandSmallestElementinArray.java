package day05_arrays;

public class LargestandSmallestElementinArray {
	public static void main(String[] args) {
		int[] arr = {12,23,4,3,34};
		int max=arr[0];
		int min=arr[0];
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println("Largest Element:"+max);
				
			}
			if(arr[i]<min) {
				min=arr[i];
				System.out.println("Smallest Element:"+min);
				
			}
		
		}
	}
}
