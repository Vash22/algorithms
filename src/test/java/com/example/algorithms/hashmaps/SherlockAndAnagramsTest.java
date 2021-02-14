package com.example.algorithms.hashmaps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SherlockAndAnagramsTest {

	@Test
	void sherlockAndAnagrams_testCase1() {
		// given
		String sample = "abba";

		// when
		SherlockAndAnagrams sherlockAndAnagrams = new SherlockAndAnagrams();
		int result = sherlockAndAnagrams.sherlockAndAnagrams(sample);

		// then
		assertThat(result).isEqualTo(4);
	}

	@Test
	void sherlockAndAnagrams_testCase2() {
		// given
		String sample = "abcd";

		// when
		SherlockAndAnagrams sherlockAndAnagrams = new SherlockAndAnagrams();
		int result = sherlockAndAnagrams.sherlockAndAnagrams(sample);

		// then
		assertThat(result).isEqualTo(0);
	}


	@Test
	void sherlockAndAnagrams_testCase3() {
		// given
		String sample = "ifailuhkqq";

		// when
		SherlockAndAnagrams sherlockAndAnagrams = new SherlockAndAnagrams();
		int result = sherlockAndAnagrams.sherlockAndAnagrams(sample);

		// then
		assertThat(result).isEqualTo(3);
	}

	@Test
	void sherlockAndAnagrams_testCase4() {
		// given
		String sample = "kkkk";

		// when
		SherlockAndAnagrams sherlockAndAnagrams = new SherlockAndAnagrams();
		int result = sherlockAndAnagrams.sherlockAndAnagrams(sample);

		// then
		assertThat(result).isEqualTo(10);
	}
}