package com.example.algorithms.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SalesByMathTest {

	@Test
	public void sockMerchantUsingMap_smallDataSet() {
		// given
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		// when
		SalesByMath salesByMath = new SalesByMath();
		int result = salesByMath.sockMerchantUsingMap(9, ar);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	public void sockMerchantUsingMap_biggerDataSet() {
		// given
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20, 3, 34, 5, 56, 65, 65, 34, 34, 23, 85, 34, 23, 54, 62, 83, 19, 24, 23, 43, 98, 76, 54, 24, 8, 52, 54, 2,
				0, 10, 20, 20, 30 };

		// when
		SalesByMath salesByMath = new SalesByMath();
		int result = salesByMath.sockMerchantUsingMap(41, ar);

		// then
		assertThat(result).isEqualTo(11);
	}

	@Test
	public void sockMerchantUsingSet_smallDataSet() {
		// given
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		// when
		SalesByMath salesByMath = new SalesByMath();
		int result = salesByMath.sockMerchantUsingSet(9, ar);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	public void sockMerchantUsingArray_smallDataSet() {
		// given
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		// when
		SalesByMath salesByMath = new SalesByMath();
		int result = salesByMath.sockMerchantUsingOnlyArray(9, ar);

		// then
		assertThat(result).isEqualTo(3);
	}
}
