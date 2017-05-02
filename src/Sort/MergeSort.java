package Sort;

/**
 * Created by found on 01-May-17.
 */
public class MergeSort {

    public static void main(String args[]) {
        int numList[] = {23,65,12,7856,345,1212,1,576,0,2,3,4,5,6,7,8,9,19837192};
        for (int i : mergeSort(numList, 0, numList.length - 1)) {
            System.out.print(i + " ");
        }
    }


    public static int[] mergeSort(int list[], int minIndex, int maxIndex) {
        if (minIndex == maxIndex) {
            return list;
        } else {
            int midIndex = (minIndex + maxIndex) / 2;
            mergeSort(list, minIndex, midIndex);
            mergeSort(list, midIndex + 1, maxIndex);
            merge(list, minIndex, midIndex, maxIndex);
        }
        return list;
    }

    private static void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
        int[] L = new int[midIndex - lowIndex + 2];
        for (int i = lowIndex; i <= midIndex; i++) {
            L[i - lowIndex] = list[i];
        }
        L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;

        int[] R = new int[highIndex - midIndex + 1];
        for (int i = midIndex + 1; i <= highIndex; i++) {
            R[i - midIndex - 1] = list[i];
        }
        R[highIndex - midIndex] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = lowIndex; k <= highIndex; k++) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
        }
    }

}
