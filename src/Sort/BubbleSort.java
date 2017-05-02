package Sort;

/**
 * Created by found on 30-Apr-17.
 */
public class BubbleSort {

    public static void main(String args[]) {
        int numList[] = {23,65,12,7856,345,1212,1,576,0};
        for (int i : bubbleSort(numList)) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int list[]) {
        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int k = 1; k < list.length - i; k++) {
                if (list[k - 1] > list[k]) {
                    temp = list[k];
                    list[k] = list[k - 1];
                    list[k - 1] = temp;
                }
            }
        }
        return list;
    }

}
