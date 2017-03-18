package Tutorials;

public class printArray {

	public static void print(int[] arry) {
		System.out.print("{ ");
		for (int x : arry) {
			System.out.print(x + " ");
		}
		System.out.println("}");
	}

}
