package HiddenWord;

/**
 * Created by found on 15-Apr-17.
 */
public class Commander {

    public static void main(String args[]) {
        HiddenWord puzzle = new HiddenWord("HELLO");
        System.out.println(puzzle.getHint("HELLO"));
    }

}
