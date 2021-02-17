package com.example.algorithms.hashmaps;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContTripletsTest {


	@Test
	@Deprecated // need to fix algorithm
	public void countTriplets_case1() {
		// given
		List<Long> input = List.of(1L, 5L, 5L, 25L, 125L);
		long rotation = 5;

		// when
		CountTriplets countTriplets = new CountTriplets();
		long triplets = countTriplets.countTriplets(input, rotation);

		// then
		assertThat(triplets).isEqualTo(4);
	}
}