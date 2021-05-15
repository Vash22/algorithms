package com.example.algorithms.hackerrank.arrays;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayManipulationTest {

	@Test
	void arrayManipulation() {
		// given
		int[][] queries = { { 1, 5, 3 }, { 4, 8, 7 }, { 6, 9, 1 } };

		// when
		long maximumValue = ArrayManipulation.arrayManipulation(10, queries);

		// then
		assertThat(maximumValue).isEqualTo(10L);
	}

	@Test
	void arrayManipulation2() {
		// given
		int[][] queries = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };

		// when
		long maximumValue = ArrayManipulation.arrayManipulation(5, queries);

		// then
		assertThat(maximumValue).isEqualTo(200L);
	}

	@Test
	void arrayManipulation3() {
		// given
		int[][] queries = { { 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } };

		// when
		long maximumValue = ArrayManipulation.arrayManipulation(10, queries);

		// then
		assertThat(maximumValue).isEqualTo(31L);
	}

	@Test
	void arrayManipulation4() throws IOException, CsvValidationException, URISyntaxException {
		// given
		int[][] queries = new int[30000][3];
		URL resource = getClass().getClassLoader().getResource("arrayManipulationBigInput.csv");
		try (CSVReader reader = new CSVReader(new FileReader(new File(resource.toURI())))) {
			String[] lineInArray;
			int i = 0;
			while ((lineInArray = reader.readNext()) != null) {
				queries[i][0] = Integer.parseInt(lineInArray[0]);
				queries[i][1] = Integer.parseInt(lineInArray[1]);
				queries[i][2] = Integer.parseInt(lineInArray[2]);
				i++;
			}
		}

		// when
		long maximumValue = ArrayManipulation.arrayManipulation(4000, queries);

		// then
		assertThat(maximumValue).isEqualTo(7542539201L);
	}

	@Test
	void arrayManipulation5() throws IOException, CsvValidationException, URISyntaxException {
		// given
		int[][] queries = new int[30000][3];
		URL resource = getClass().getClassLoader().getResource("arrayManipulationBigInput.csv");
		try (CSVReader reader = new CSVReader(new FileReader(new File(resource.toURI())))) {
			String[] lineInArray;
			int i = 0;
			while ((lineInArray = reader.readNext()) != null) {
				queries[i][0] = Integer.parseInt(lineInArray[0]);
				queries[i][1] = Integer.parseInt(lineInArray[1]);
				queries[i][2] = Integer.parseInt(lineInArray[2]);
				i++;
			}
		}

		// when
		long maximumValue = ArrayManipulation.arrayManipulationFasterVersion(4000, queries);

		// then
		assertThat(maximumValue).isEqualTo(7542539201L);
	}

}