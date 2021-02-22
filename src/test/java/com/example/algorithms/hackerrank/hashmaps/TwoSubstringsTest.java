package com.example.algorithms.hackerrank.hashmaps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSubstringsTest {

	@Test
	void twoStrings() {
		//given
		String first = "hello";
		String second = "world";

		// when
		TwoSubstrings twoSubstrings = new TwoSubstrings();
		String answer = twoSubstrings.twoStrings(first, second);

		// when
		assertThat(answer).isEqualTo("Yes");
	}
}