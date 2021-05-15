package com.algorithms.hackerrank.arrays;

import java.util.Arrays;

public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {
		long[] someArray = new long[n];
		long max = Long.MIN_VALUE;
		for (int[] query : queries) {
			int left = query[0];
			int right = query[1];
			int value = query[2];
			for (int j = left - 1; j < right; j++) {
				someArray[j] = someArray[j] + value;
				if (someArray[j] > max) {
					max = someArray[j];
				}
			}
		}
		return max;
	}

	public static long arrayManipulationFasterVersion(int n, int[][] queries) {
		for (int[] query : queries) {
			int left = query[0];
			int right = query[1];
			int value = query[2];
		}
		return 0;
	}
}
