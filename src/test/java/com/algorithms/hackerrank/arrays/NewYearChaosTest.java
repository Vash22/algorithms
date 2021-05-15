package com.algorithms.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewYearChaosTest {

	@Test
	void minimumBribes() {
		// given
		int[] input = { 2, 1, 5, 3, 4 };

		// when
		NewYearChaos newYearChaos = new NewYearChaos();
		String output = newYearChaos.minimumBribes(input);

		// then

		assertThat(output).isEqualTo("3");
	}

	@Test
	void minimumBribes_testCase2() {
		// given
		int[] input = { 2, 5, 1, 3, 4 };

		// when
		NewYearChaos newYearChaos = new NewYearChaos();
		String output = newYearChaos.minimumBribes(input);

		// then

		assertThat(output).isEqualTo("Too chaotic");
	}

	@Test
	void minimumBribes_testCase3() {
		// given
		int[] input = { 5, 1, 2, 3, 7, 8, 6, 4 };

		// when
		NewYearChaos newYearChaos = new NewYearChaos();
		String output = newYearChaos.minimumBribes(input);

		// then

		assertThat(output).isEqualTo("Too chaotic");
	}

	@Test
	void minimumBribes_testCase4() {
		// given
		int[] input = { 1, 2, 5, 3, 7, 8, 6, 4 };

		// when
		NewYearChaos newYearChaos = new NewYearChaos();
		String output = newYearChaos.minimumBribes(input);

		// then

		assertThat(output).isEqualTo("7");
	}
}