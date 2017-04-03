package Tutorials;

import java.util.ArrayList;

public class Array_and_ArrayList {

    public static void main(String[] args) {
        int intList[] = {1,2,3,4,5};
        System.out.println(intList[3]);
        System.out.println(intList.length);
        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(0);
        intArrayList.add(1);
        intArrayList.add(2);
        System.out.println(intArrayList);
    }

}
