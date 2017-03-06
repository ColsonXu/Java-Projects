package Tutorials;

public class ArraySummation {

// Calculate the sum of all the elements in an array.
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		int[] arry = {12,323,4345,3456,45,457,457,23,123,124};
		for (int i = 0; i < arry.length; i++) {
			sum += arry[i];
		}
		System.out.println(sum);

	}

}
