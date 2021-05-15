package com.algorithms.common.sorting;

public class QuickSort {

	public void sort(int[] input, int left, int right) {
		if (left < right) {
			int middle = divideInput(input, left, right);
			sort(input, left, middle - 1);
			sort(input, middle + 1, right);
		}
	}

	private int divideInput(int[] input, int left, int right) {
		int divideIndex = chooseDividePoint(left, right);
		int divideValue = input[divideIndex];
		swap(input, divideIndex, right);
		int actualPosition = left;
		for (int i = left; i < right; i++) {
			if (input[i] < divideValue) {
				swap(input, i, actualPosition);
				actualPosition++;
			}
		}
		swap(input, actualPosition, right);
		return actualPosition;
	}

	private void swap(int[] input, int left, int right) {
		if (left != right) {
			int tmp = input[left];
			input[left] = input[right];
			input[right] = tmp;
		}
	}

	private int chooseDividePoint(int left, int right) {
		return left + (right - left) / 2;

	}
}
