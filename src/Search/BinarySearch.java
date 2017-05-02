package Search;

/**
 * Created by found on 01-May-17.
 */
public class BinarySearch {

    public static void main(String args[]) {
        int list[] = {1,3,423,0,76,234,324,23,52,376,3456,6,34,5234};
        Sort.MergeSort.mergeSort(list, 0, list.length - 1);
        System.out.println(binarySearch(list, 6));
    }


    public static int binarySearch(int list[], int num) {
        int minIndex = 0;
        int maxIndex = list.length - 1;
        int midIndex = maxIndex / 2;
        while (minIndex <= maxIndex) {
            if (list[midIndex] == num) {
                return midIndex;
            } else if (list[midIndex] < num) {
                minIndex = midIndex + 1;
            } else {
                maxIndex = midIndex - 1;
            }
        }
        return -1;
    }

}
