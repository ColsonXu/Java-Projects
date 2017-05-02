package Search;

/**
 * Created by found on 01-May-17.
 */
public class SequentialSearch {

    public static void main(String args[]) {
        int list[] = {1,3,423,0,76,234,324,23,52,376,3456,6,34,5234};
        System.out.println(sequentialSearch(list, 6));
    }


    private static int sequentialSearch(int list[], int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
