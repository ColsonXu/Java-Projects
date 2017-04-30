package NumberGroup;

import java.util.List;

/**
 * Created by found on 30-Apr-17.
 */
public class MultipleGroups {
    private List<NumberGroup> groupList;


    public boolean contains(int num) {
        for (NumberGroup group : groupList) {
            if (group.contains(num)) {
                return true;
            }
        }
        return false;
    }

}
