package com.example.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMath {

	public int sockMerchantUsingMap(int n, int[] ar) {
		Map<Integer, Long> collect = Arrays.stream(ar).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		AtomicLong sum = new AtomicLong();
		collect.forEach((k, v) -> {
			long l = v / 2;
			sum.addAndGet(l);
		});
		return sum.intValue();
	}

	public int sockMerchantUsingSet(int i, int[] ar) {
		Set<Integer> valueAlreadyFound = new HashSet<>();
		int amountOfPairs = 0;
		for (int j = 0; j < ar.length; j++) {
			int actualValue = ar[j];
			if (valueAlreadyFound.contains(actualValue)) {
				valueAlreadyFound.remove(actualValue);
				amountOfPairs++;
			} else {
				valueAlreadyFound.add(actualValue);
			}
		}
		return amountOfPairs;
	}

	public int sockMerchantUsingOnlyArray(int i, int[] ar) {
		int[] sortedInts = Arrays.stream(ar).sorted().toArray();
		int amountOfPairs = 0;
		for (int j = 0; j < i; j++) {
			if (j + 1 == i) {
				break;
			}
			if (sortedInts[j] == sortedInts[j + 1]) {
				j++;
				amountOfPairs++;
			}
		}
		return amountOfPairs;
	}
}
