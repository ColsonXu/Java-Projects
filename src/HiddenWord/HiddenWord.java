package HiddenWord;

/**
 * Created by found on 15-Apr-17.
 */
public class HiddenWord {

    private String puzzle;

    public HiddenWord(String word) {
        puzzle = word;
    }

    public String getHint(String guess) {
        String Hint = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == puzzle.charAt(i)) {
                Hint += guess.charAt(i);
            } else if (puzzle.indexOf(guess.charAt(i)) >= 0) {
                Hint += "+";
            } else {
                Hint += "*";
            }
        }
        return Hint;
    }
}
