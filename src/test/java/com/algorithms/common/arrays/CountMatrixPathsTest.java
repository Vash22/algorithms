package com.algorithms.common.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithms.common.arrays.CountMatrixPaths.countMatrixPathsDynamicProgramming;
import static com.algorithms.common.arrays.CountMatrixPaths.countMatrixPathsRec;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CountMatrixPathsTest {

	@Test
	public void checkRecursively() {
		// given
		// @formatter:off
		int[][] matrix = {
				{ 1, 0, 1, 1 },
				{ 1, 1, 1 ,1 },
				{ 1, 1, 1 ,1 }};
		// @formatter:on

		// when
		int amountOfPaths = countMatrixPathsRec(matrix, 0, 0);

		// then
		assertThat(amountOfPaths).isEqualTo(4);
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
