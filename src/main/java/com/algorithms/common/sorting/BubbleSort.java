package com.algorithms.common.sorting;

public class BubbleSort {

	public static int[] sort(int[] input) {
		for (int i = input.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

	public static int[] sortRec(int[] input, int length, int current) {
		if (length == 1) {
			return input;
		}
		if (current == length - 1) {
			current = 0;
			length--;
		}

		if (input[current] > input[current + 1]) {
			int tmp = input[current];
			input[current] = input[current + 1];
			input[current + 1] = tmp;
		}
		current++;

		return sortRec(input, length, current);
	}

}
