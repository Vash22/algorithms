package com.example.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.algorithms.CountMatrixPaths.countMatrixPathsDynamicProgramming;
import static com.example.algorithms.CountMatrixPaths.countMatrixPathsRec;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CountMatrixPathsTest {

	@Test
	public void checkRecursively() {
		// given
		int[][] matrix = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		// when
		int amountOfPaths = countMatrixPathsRec(matrix, 0, 0);

		// then
		assertThat(amountOfPaths).isEqualTo(6);
	}

	@Test
	public void checkDynamicProgramming() {
		// given
		int[][] matrix = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		// when
		int amountOfPaths = countMatrixPathsDynamicProgramming(matrix);

		// then
		assertThat(amountOfPaths).isEqualTo(6);
	}
}
