package Log;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by found on 21-Apr-17.
 */
public class SystemLog extends LogMessage{
    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> popedEntries = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).equals(keyword)) {
                popedEntries.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return popedEntries;
    }

}
