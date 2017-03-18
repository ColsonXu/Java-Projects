package Scratch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class primeFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("? ");
            double numIn = input.nextDouble();
            if (numIn == 0) {
                break;
            }
            System.out.println(isPrime(numIn));
        }
    }


    private static boolean isPrime(double n) {
        // Split the number in an ArrayList for futher usage.
        int ni = (int)n;
        int length = String.valueOf(n).length();
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            numList.add(ni % 10);
            ni /= 10;
        }
        // Reverse the order of the ArrayList.
        Collections.reverse(numList);
        // Calculate the sum of all elements for futher usage.
        double sum = 0.0;
        for (int i : numList) {
          sum += i;
        }
        if (n == 2 || n == 3 || n == 5) {
            return true;
        } else if (numList.get(numList.size() - 1) == 0 || numList.get(numList.size() - 1) == 5) {
            return false;
        }else if (numList.get(numList.size() - 1) % 2 == 0) {
            return false;
        } else if (sum % 3 == 0) {
            System.out.println(n % 3);
            return false;
        } else if ((n % 100) % 4 == 0) {
            return false;
        }

        return true;
    }
}