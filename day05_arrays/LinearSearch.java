package day05_arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {3,66,32,12,4,2};
		int key=12;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			
		if(arr[i]==key) {
			found=true;
			System.out.println(key+" Element Found at index "+i);
			break;
		}
		 
	}
	if(!found) {
		System.out.println("Element not Found");
		}

}
}

