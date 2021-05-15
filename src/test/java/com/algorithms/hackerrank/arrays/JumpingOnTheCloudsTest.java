package com.algorithms.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JumpingOnTheCloudsTest {

	@Test
	public void jumpingOnClouds_jumpAmount() {

		// given
		int[] clouds = { 0, 0, 1, 0, 0, 1, 0 };

		// when
		JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheClouds();
		int numberOfJumps = jumpingOnTheClouds.jumpingOnClouds(clouds);

		// then

		assertThat(numberOfJumps).isEqualTo(4);
	}

	@Test
	public void jumpingOnClouds_jumpAmountSecondTest() {

		// given
		int[] clouds = { 0, 0, 0, 1, 0, 0 };

		// when
		JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheClouds();
		int numberOfJumps = jumpingOnTheClouds.jumpingOnClouds(clouds);

		// then

		assertThat(numberOfJumps).isEqualTo(3);
	}
}