package com.algorithms.hackerrank.arrays;

public class RotationLeft {

	public int[] rotLeft(int[] a, int d) {
		int[] rotatedArray = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (d == a.length) {
				d = 0;
			}
			rotatedArray[i] = a[d];
			d++;
		}
		return rotatedArray;
	}
}
