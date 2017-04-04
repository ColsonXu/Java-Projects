package Tutorials;

import java.util.Scanner;

/**
 * Created by found on 04-Apr-17.
 */

public class Recursion {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Factorial of: ");
        long number = input.nextLong();
        input.close();
        System.out.printf("The factorial of %d is %d.", number, factorial(number));
    }

    public static long factorial(long num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
