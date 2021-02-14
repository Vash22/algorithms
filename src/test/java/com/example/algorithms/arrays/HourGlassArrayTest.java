package com.example.algorithms.arrays;

import org.junit.jupiter.api.Test;

import com.example.algorithms.arrays.HourglassArray;

import static org.assertj.core.api.Assertions.assertThat;

class HourGlassArrayTest {

	@Test
	public void hourglassSum_case1() {
		// given
		// @formatter:off
		int[][] arr = {
				{ 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 },
				{ 0, 0, 1, 2, 4, 0 } };
		// @formatter:on

		// when
		long hourglassSum = new HourglassArray().hourglassSum(arr);

		// then
		assertThat(hourglassSum).isEqualTo(19);
	}

	@Test
	public void hourglassSum_case2() {
		// given
		// @formatter:off
		int[][] arr = {
				{ -9, -9, -9, 1, 1, 1 },
				{ 0, -9, 0, 4, 3, 2 },
				{ -9, -9, -9, 1, 2, 3 },
				{ 0, 0, 8, 6, 6, 0 },
				{ 0, 0, 0, -2, 0, 0 },
				{ 0, 0, 1, 2, 4, 0 } };
		// @formatter:on

		// when
		long hourglassSum = new HourglassArray().hourglassSum(arr);

		// then
		assertThat(hourglassSum).isEqualTo(28);
	}

	@Test
	public void hourglassSum_case3() {
		// given
		// @formatter:off
		int[][] arr = {
				{ -1, -1, 0, -9, -2, -2 },
				{ -2, -1, -6, -8, -2, -5 },
				{ -1, -1, -1, -2, -3, -4 },
				{ -1, -9, -2, -4, -4, -5 },
				{ -7, -3, -3, -2, -9, -9 },
				{ -1, -3, -1, -2, -4, -5 } };
		// @formatter:on

		// when
		long hourglassSum = new HourglassArray().hourglassSum(arr);

		// then
		assertThat(hourglassSum).isEqualTo(-6);
	}
}