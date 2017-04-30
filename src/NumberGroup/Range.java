package NumberGroup;

/**
 * Created by found on 30-Apr-17.
 */
public class Range implements NumberGroup{

    private int min;
    private int max;

    public Range(int lo, int hi) {
        min = lo;
        max = hi;
    }

    @Override
    public boolean contains(int num) {
        if (min <= num && max >= num) {
            return true;
        }
        return false;
    }
}
