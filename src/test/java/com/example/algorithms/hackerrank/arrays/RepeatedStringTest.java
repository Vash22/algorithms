package com.example.algorithms.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RepeatedStringTest {

	@Test
	public void repeatedString_case1() {
		// given
		String s = "aba";

		// when
		RepeatedString repeatedString = new RepeatedString();
		long appearance = repeatedString.repeatedString(s, 10);

		// then

		assertThat(appearance).isEqualTo(7);
	}

	@Test
	public void repeatedString_case2() {
		// given
		String s = "a";

		// when
		RepeatedString repeatedString = new RepeatedString();
		long appearance = repeatedString.repeatedString(s, 10000);

		// then

		assertThat(appearance).isEqualTo(10000);
	}
}