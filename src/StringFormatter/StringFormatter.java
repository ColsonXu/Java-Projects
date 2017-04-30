package StringFormatter;

import org.jetbrains.annotations.Contract;

import java.util.List;

/**
 * Created by found on 26-Apr-17.
 */
public class StringFormatter {

    public static int totalLetters(List<String> wordList) {
        int count = 0;
        for (String word: wordList) {
            count += word.length();
        }
        return count;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int gapWidth;
        gapWidth = (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
        return gapWidth;
    }

    /*
    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        int leftover;

        return leftover;
    }
    */
}
