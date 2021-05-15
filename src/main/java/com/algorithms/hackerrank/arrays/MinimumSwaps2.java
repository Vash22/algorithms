package com.algorithms.hackerrank.arrays;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumSwaps2 {

	static int minimumSwaps(int[] arr) {
		int counter = 0;
		Map<Integer, Integer> valuePointingToIndex = IntStream.range(0, arr.length).boxed().collect(Collectors.toMap(i -> arr[i], i -> i));
		for (int i = 0; i < arr.length - 1; i++) {
			int actual = arr[i];
			if (actual != i + 1) {
				Integer positionOfValueWithoutOrder = valuePointingToIndex.get(i + 1);
				valuePointingToIndex.put(actual, positionOfValueWithoutOrder);
				valuePointingToIndex.put(arr[positionOfValueWithoutOrder], i);
				int tmp = arr[i];
				arr[i] = arr[positionOfValueWithoutOrder];
				arr[positionOfValueWithoutOrder] = tmp;
				counter++;
			}
		}
		return counter;
	}

}
