package Log;

/**
 * Created by found on 21-Apr-17.
 */
public class LogMessage {

    private String machineId;
    private String description;

    public LogMessage() {}

    public LogMessage(String message) {
        machineId = message.split(":")[0];
        description = message.split(":")[1];
    }

    public boolean containsWord(String keyword) {
        String[] temp = description.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals(keyword)) {
                return true;
            }
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
