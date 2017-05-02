package Sort;

/**
 * Created by found on 01-May-17.
 */
public class SelectionSort {

    public static void main(String args[]) {
        int numList[] = {23,65,12,7856,345,1212,1,576,0};
        for (int i : selectionSort(numList)) {
            System.out.print(i + " ");
        }
    }


    public static int[] selectionSort(int list[]) {
        int temp, min, minIndex;
        for (int i = 0; i < list.length; i++) {
            min = list[i];
            minIndex = i;
            for (int k = i; k < list.length; k++) {
                if (list[k] < min) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if (min < list[i]) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        return list;
    }

}
