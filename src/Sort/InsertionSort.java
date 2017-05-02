package Sort;

/**
 * Created by found on 01-May-17.
 */
public class InsertionSort {

    public static void main(String args[]) {
        int numList[] = {23,65,12,7856,345,1212,1,576,0};
        for (int i : insertionSort(numList)) {
            System.out.print(i + " ");
        }
    }


    public static int[] insertionSort(int list[]) {
        int j, k, temp;
        for (int i = 1; i < list.length; i++) {
            k = list[i];
            j = i - 1;
            while (j >= 0 && k < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }
        }
        return list;
    }

}
