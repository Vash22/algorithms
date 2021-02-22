package com.example.algorithms.common.arrays;

public class CountMatrixPaths {

	public static int countMatrixPathsDynamicProgramming(int[][] matrix) {
		int[][] dp = new int[matrix.length][matrix[0].length];

		// no of path for first row will be 1 as you can move only in one direction
		for (int i = 0; i < dp.length; i++) {
			dp[0][i] = 1;
		}

		// no of path for first column will be 1 as you can move only in one direction
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp.length; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		return dp[matrix.length - 1][matrix[0].length - 1];
	}

	public static int countMatrixPathsRec(int[][] matrix, int row, int col) {
		if (row == matrix.length - 1 || col == matrix[0].length - 1) {
			return 1;
		}
		if (matrix[row][col] == 1) {
			return countMatrixPathsRec(matrix, row + 1, col) + countMatrixPathsRec(matrix, row, col + 1);
		} else {
			return 0;
		}
	}
}
