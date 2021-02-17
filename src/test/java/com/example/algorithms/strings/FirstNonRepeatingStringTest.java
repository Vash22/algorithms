package com.example.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingStringTest {

	@Test
	void find_testCase1() {
		String input = "aaabcccdeeef";

		char result = FirstNonRepeatingString.find(input);

		assertThat(result).isEqualTo('b');
	}

	@Test
	void find_testCase2() {
		String input = "abcbad";

		char result = FirstNonRepeatingString.find(input);

		assertThat(result).isEqualTo('c');
	}

	@Test
	void find_testCase3() {
		String input = "abcabcabc";

		char result = FirstNonRepeatingString.find(input);

		assertThat(result).isEqualTo('_');
	}
}