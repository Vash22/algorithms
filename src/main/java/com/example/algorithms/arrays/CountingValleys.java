package com.example.algorithms.arrays;

public class CountingValleys {

	public int countingValleys(int steps, String path) {
		char[] someSteps = path.toCharArray();
		int numberOfValleys = 0;
		int actualLevel = 0;
		boolean valleyCalculated = false;
		for (char someStep : someSteps) {
			actualLevel += someStep == 'U' ? 1 : -1;
			if (actualLevel < 0 && !valleyCalculated){
				numberOfValleys++;
				valleyCalculated = true;
			} else if (actualLevel == 0) {
				valleyCalculated = false;
			}
		}
		return numberOfValleys;
	}
}
