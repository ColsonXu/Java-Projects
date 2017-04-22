package Log;

/**
 * Created by found on 21-Apr-17.
 */
public class Commander {

    public static void main(String args[]) {
        LogMessage log1 = new LogMessage("CLIENT3:security alert - repeated login failures");
        System.out.println(log1.getMachineId());
        System.out.println(log1.getDescription());
        System.out.println(log1.containsWord("failures"));
    }

}
