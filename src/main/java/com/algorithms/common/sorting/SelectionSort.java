package com.algorithms.common.sorting;

public class SelectionSort {

	public static int[] sort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int minIndex = i;
			for (int j = i; j < input.length - 1; j++) {
				if (input[minIndex] > input[j + 1]) {
					minIndex = j + 1;
				}
			}
			int tmp = input[i];
			input[i] = input[minIndex];
			input[minIndex] = tmp;
		}
		return input;
	}
}
