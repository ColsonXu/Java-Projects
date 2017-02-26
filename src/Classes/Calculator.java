package Classes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);
		double fstNum, secNum, ans;
		System.out.println("Please enter your first number: ");
		fstNum = calc.nextDouble();
		System.out.println("Please enter your second number: ");
		secNum = calc.nextDouble();
		ans = fstNum + secNum;
		System.out.print("Your answer is: " + ans);
		calc.close();
	}

}
