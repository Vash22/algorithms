package com.example.algorithms.hashmaps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSubstringsTest {

	@Test
	void twoStrings() {
		String first = "hello";
		String second = "world";

		TwoSubstrings twoSubstrings = new TwoSubstrings();
		String answer = twoSubstrings.twoStrings(first, second);

		assertThat(answer).isEqualTo("Yes");
	}
}