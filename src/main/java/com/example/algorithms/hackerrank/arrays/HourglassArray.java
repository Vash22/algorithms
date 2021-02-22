package com.example.algorithms.hackerrank.arrays;

public class HourglassArray {

	public int hourglassSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int row = 1; row < arr.length - 1; row++) {
			for (int col = 1; col < arr[row].length - 1; col++) {
				int sum = arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1] + arr[row][col] + arr[row + 1][col - 1] + arr[row + 1][col] + arr[row + 1][col + 1];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}
}
