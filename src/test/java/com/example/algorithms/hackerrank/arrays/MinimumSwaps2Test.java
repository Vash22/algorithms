package com.example.algorithms.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumSwaps2Test {

	@Test
	void minimumSwaps() {
		// given
		int[] input = { 7, 1, 3, 2, 4, 5, 6 };

		// when
		int minimumSwaps = MinimumSwaps2.minimumSwaps(input);

		// then
		assertThat(minimumSwaps).isEqualTo(5);
	}

	@Test
	void minimumSwaps2() {
		// given
		int[] input = { 4, 3, 1, 2 };

		// when
		int minimumSwaps = MinimumSwaps2.minimumSwaps(input);

		// then
		assertThat(minimumSwaps).isEqualTo(3);
	}

	@Test
	void minimumSwaps3() {
		// given
		int[] input = { 2, 3, 4, 1, 5 };

		// when
		int minimumSwaps = MinimumSwaps2.minimumSwaps(input);

		// then
		assertThat(minimumSwaps).isEqualTo(3);
	}

	@Test
	void minimumSwaps4() {
		// given
		int[] input = { 1, 3, 5, 2, 4, 6, 7 };

		// when
		int minimumSwaps = MinimumSwaps2.minimumSwaps(input);

		// then
		assertThat(minimumSwaps).isEqualTo(3);
	}
}