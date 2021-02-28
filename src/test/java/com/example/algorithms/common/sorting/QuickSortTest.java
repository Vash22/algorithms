package com.example.algorithms.common.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {

	@Test
	void sort() {
		// given
		int[] input = { 55, 23, 12, 11, 2, 34, 5, 2, 4, 12, 34, 3 };

		// when
		new QuickSort().sort(input, 0, input.length - 1);

		// then
		assertThat(input).containsExactly(2, 2, 3, 4, 5, 11, 12, 12, 23, 34, 34, 55);
	}

	@Test
	void sort2() {
		// given
		int[] input = { 5, 4, 3, 6, 2 };

		// when
		new QuickSort().sort(input, 0, input.length - 1);

		// then
		assertThat(input).containsExactly(2, 3, 4, 5, 6);
	}

	@Test
	void sort3() {
		// given
		int[] input = { 5,4,6 };

		// when
		new QuickSort().sort(input, 0, input.length - 1);

		// then
		assertThat(input).containsExactly(4, 5, 6);
	}
}