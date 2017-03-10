package dataTypeChecker;

/**
 * Created by found on 10-Mar-17.
 */

public class typeChecker {

    public static Class<Integer> checkType(final int input) {
        return Integer.TYPE;
    }

    public static Class<Long> checkType(final long input) {
        return Long.TYPE;
    }

    public static Class<Double> checkType(final double input) {
        return Double.TYPE;
    }
    
    public static String checkType(final String input) {
    	return "String";
    }
    
}
