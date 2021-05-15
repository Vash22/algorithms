package com.algorithms.common.search;

public class BinarySearch {

	public static int search(int[] input, int searchValue) {
		int leftIndex = 0;
		int rightIndex = input.length - 1;
		while (leftIndex <= rightIndex) {
			int i = (rightIndex + leftIndex) / 2;
			if (searchValue > input[i]) {
				leftIndex = i + 1;
			} else if (searchValue < input[i]) {
				rightIndex = i - 1;
			} else {
				return i;
			}
		}
		return -1;
	}
}
