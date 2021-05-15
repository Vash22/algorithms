package com.algorithms.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingValleysTest {

	@Test
	public void countingValleys_simplePath() {
		// given
		int numberOfSteps = 8;
		String path = "UDDDUDUU";

		// when
		CountingValleys countingValleys = new CountingValleys();
		int numberOfValleys = countingValleys.countingValleys(numberOfSteps, path);

		// then

		assertThat(numberOfValleys).isEqualTo(1);
	}

	@Test
	public void countingValleys_ComplicatedPath() {
		// given
		int numberOfSteps = 100;
		String path = "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD";

		// when
		CountingValleys countingValleys = new CountingValleys();
		int numberOfValleys = countingValleys.countingValleys(numberOfSteps, path);

		// then

		assertThat(numberOfValleys).isEqualTo(2);
	}

}