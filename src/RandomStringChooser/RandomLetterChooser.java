package RandomStringChooser;

import java.util.ArrayList;
import java.util.List;

public class RandomLetterChooser extends RandomStringChooser {
	public RandomLetterChooser(String str) {
		super(getStringLetters(str));
	}
	
	
	
	
	
	public static String[] /*List<Character>*/ getStringLetters(String str) {
		/*
		List<Character> collected = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			collected.add(str.charAt(i));
		}
		System.out.println(collected);
		return collected;
		*/
		return null;
	}
}
