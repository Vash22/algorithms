package com.example.algorithms.hashmaps;

import org.junit.jupiter.api.Test;

import com.example.algorithms.hashmaps.WordsInPhoneNumber;

import static org.assertj.core.api.Assertions.assertThat;

class WordsInPhoneNumberTest {

	@Test
	void computeWitchWordsAreInPhoneNumber() {
		String[] words = { "foo", "baz", "bar", "foobar", "emo", "cap", "car", "cat" };
		String phoneNumber = "3662277";

		String[] output = new WordsInPhoneNumber().computeWitchWordsAreInPhoneNumber(phoneNumber, words);

		assertThat(output).containsExactlyInAnyOrder("bar", "cap", "car", "emo", "foo", "foobar");
	}
}