package com.algorithms.common.sorting;

public class InsertionSort {

	public static int[] sort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int j = i;
			int toInsert = input[i];
			while ((j > 0) && (input[j - 1] > toInsert)) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = toInsert;
		}
		return input;
	}
}
