package FR_2015;

/**
 * Created by found on 12-Mar-17.
 */

import Tutorials.printArray;

public class DiverseArray {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(arraySum(array1));
        int[][] array2 = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
        printArray.print(rowSums(array2));
        System.out.println(isDiverse(array2));
    }

    public static int arraySum(int[] arry) {
        int sum = 0;
        for (int i : arry) {
            sum += i;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int k = 0; k < arr2D.length; k++) {
            sums[k] = arraySum(arr2D[k]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] rowSums = rowSums(arr2D);
        for (int i1 = 0; i1 < rowSums.length; i1++) {
            for (int i2 = i1 + 1; i2 < rowSums.length; i2++) {
                if (rowSums[i1] == rowSums[i2]) {
                    return false;
                }
            }
        }
        return true;
    }
}
