package Tutorials;

public class ArrayTable {

// Print out the value in the array in the form of a table.
	
	public static void main(String[] args) {
		
		int[] arry = {1,1,23,4,234,435,34,634,6,4356,234,91283};
		System.out.println("Index\tValue");
		for (int counter = 0; counter < arry.length; counter++) {
			System.out.println(counter + "\t" + arry[counter]);
		}

	}

}
