package com.example.algorithms.hackerrank.hashmaps;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContTripletsTest {

	@Test
	public void countTriplets_case1() {
		// given
		List<Long> input = List.of(1L, 5L, 5L, 25L, 125L);
		long rotation = 5;

		// when
		CountTripletsInGeometricProgression countTripletsInGeometricProgression = new CountTripletsInGeometricProgression();
		long triplets = countTripletsInGeometricProgression.countTriplets(input, rotation);

		// then
		assertThat(triplets).isEqualTo(4);
	}

	@Test
	public void countTriplets_case2() {
		// given
		List<Long> input = List
				.of(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
						1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
						1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long rotation = 1;
		assertThat(input).hasSize(100);

		// when
		CountTripletsInGeometricProgression countTripletsInGeometricProgression = new CountTripletsInGeometricProgression();
		long triplets = countTripletsInGeometricProgression.countTriplets(input, rotation);

		// then
		assertThat(triplets).isEqualTo(161700);
	}

	@Test
	public void countTriplets_case3() {
		// given
		List<Long> input = List.of(1L, 3L, 9L, 9L, 27L, 81L);
		long rotation = 3;

		// when
		CountTripletsInGeometricProgression countTripletsInGeometricProgression = new CountTripletsInGeometricProgression();
		long triplets = countTripletsInGeometricProgression.countTriplets(input, rotation);

		// then
		assertThat(triplets).isEqualTo(6);
	}

	@Test
	public void countTriplets_case4() {
		// given
		List<Long> input = List.of(1L, 2L, 2L, 4L);
		long rotation = 2;

		// when
		CountTripletsInGeometricProgression countTripletsInGeometricProgression = new CountTripletsInGeometricProgression();
		long triplets = countTripletsInGeometricProgression.countTriplets(input, rotation);

		// then
		assertThat(triplets).isEqualTo(2);
	}
}