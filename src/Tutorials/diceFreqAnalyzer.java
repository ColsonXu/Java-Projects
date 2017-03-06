package Tutorials;

import java.util.Random;

public class diceFreqAnalyzer {

// Analyze the distribution of a randomly rolled die.
	
	public static void main(String[] args) {

		int[] freq = new int[7];
		Random outcome = new Random();
		
		for (int i = 0; i < 100; i++) {
			++freq[1 + outcome.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		for (int face = 1; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);
		}
	}

}
