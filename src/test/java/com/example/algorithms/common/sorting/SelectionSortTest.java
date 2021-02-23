package com.example.algorithms.common.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

	@Test
	void sort() {
		// given
		int[] input = { 55, 23, 12, 11, 2, 34, 5, 2, 4, 12, 34, 3 };

		// when
		int[] sorted = SelectionSort.sort(input);

		// then
		assertThat(sorted).containsExactly(2, 2, 3, 4, 5, 11, 12, 12, 23, 34, 34, 55);
	}
}