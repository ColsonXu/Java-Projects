package RandomStringChooser;

import java.util.ArrayList;
import java.util.Random;

public class RandomStringChooser extends test {
	
	private String[] array;
	private ArrayList<Integer> usedIndex = new ArrayList<Integer>();

	public RandomStringChooser(String[] wordArray) {
		array = wordArray;
	}

	
	protected String getNext() {
		Random word = new Random();
		int index;
		while (true) {
			index = word.nextInt(array.length);   //Might cause problem.
			if (!usedIndex.contains(index)) {
				System.out.print(array[index]);
				usedIndex.add(index);
				break;
			} else if (usedIndex.size() == array.length) {
				System.out.print("NONE");
				break;
			}
		}
		return "";
	}

}
