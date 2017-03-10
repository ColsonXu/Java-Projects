package dataTypeChecker;

import static dataTypeChecker.typeChecker.checkType;

public class Commander {

    public static void main(String[] args) {
        int i = 10;
        double d = 3.234;
        System.out.println(checkType(i));
        System.out.println(checkType(d));
        System.out.println(checkType("hehehe"));
    }

}
