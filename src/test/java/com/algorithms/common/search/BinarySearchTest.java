package com.algorithms.common.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

	@Test
	void search() {
		// given
		int[] input = { 1, 4, 6, 7, 8 };
		int searchValue = 4;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(searchedIndex).isEqualTo(1);
	}

	@Test
	void search_whenSearchedValueIsInTheMiddle() {
		// given
		int[] input = { 1, 4, 6, 7, 8 };
		int searchValue = 6;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(searchedIndex).isEqualTo(2);
	}

	@Test
	void search_whenSearchedValueIsOnTheBegin() {
		// given
		int[] input = { 1, 4, 6, 7, 8 };
		int searchValue = 1;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(searchedIndex).isEqualTo(0);
	}

	@Test
	void search_whenSearchedValueIsOnTheEnd() {
		// given
		int[] input = { 1, 4, 6, 7, 8 };
		int searchValue = 8;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(searchedIndex).isEqualTo(4);
	}

	@Test
	void search_missingSearchValue() {
		// given
		int[] input = { 1, 4, 6, 7, 8 };
		int searchValue = 9;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(searchedIndex).isEqualTo(-1);
	}

	@Test
	void search_missingSearchValueLeftEnd() {
		// given
		int[] input = { 3, 4, 6, 7, 8 };
		int searchValue = 2;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(searchedIndex).isEqualTo(-1);
	}

	@Test
	void search_duplicateInInput() {
		// given
		int[] input = { 1, 4, 6, 7, 7, 8, 23, 43, 45, 47, 48, 50, 57, 87, 98, 102, 105, 106 };
		int searchValue = 7;

		// when
		int searchedIndex = BinarySearch.search(input, searchValue);

		// then
		assertThat(input[searchedIndex]).isEqualTo(searchValue);
	}
}