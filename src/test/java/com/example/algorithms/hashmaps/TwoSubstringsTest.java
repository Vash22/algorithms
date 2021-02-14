package com.example.algorithms.hashmaps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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