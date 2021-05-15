package com.algorithms.hackerrank.hashmaps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNoteTest {

	@Test
	void checkMagazine_testCase1() {
		// given
		String[] magazine = "give me one grand today night".split(" ");
		String[] note = "give one grand today".split(" ");

		// when
		RansomNote ransomNote = new RansomNote();
		String answer = ransomNote.checkMagazine(magazine, note);

		// then
		assertThat(answer).isEqualTo("Yes");
	}
	@Test
	void checkMagazine_testCase2() {
		// given
		String[] magazine = "two times three is not four".split(" ");
		String[] note = "two times two is four".split(" ");

		// when
		RansomNote ransomNote = new RansomNote();
		String answer = ransomNote.checkMagazine(magazine, note);

		// then
		assertThat(answer).isEqualTo("No");
	}
}