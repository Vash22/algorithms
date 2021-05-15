package com.algorithms.hackerrank.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTripletsInGeometricProgression {

	public long countTriplets(List<Long> arr, long r) {
		Map<Integer, List<Long>> triples = new HashMap<>();
		Map<Integer, List<Long>> triplesDouble = new HashMap<>();
		Long lastSeenValue = null;
		int counter = 0;
		int j = -1;
		for (int i = 0; i < arr.size(); i++, j--) {
			List<Long> newTriple = new ArrayList<>();
			Long currentArrayValue = arr.get(i);
			newTriple.add(currentArrayValue);
			triples.put(i, newTriple);
			for (Map.Entry<Integer, List<Long>> entry : triples.entrySet()) {

				if (entry.getValue().size() == 1) {
					Long first = entry.getValue().get(0);
					long multipliedFirst = first * r;
					if (currentArrayValue == multipliedFirst) {
						entry.getValue().add(currentArrayValue);
					}
				}
				if (entry.getValue().size() == 2) {
					if (currentArrayValue.equals(lastSeenValue)) {
						triplesDouble.put(j, new ArrayList<>(entry.getValue()));
					}
					Long second = entry.getValue().get(1);
					long multipliedFirst = second * r;
					if (currentArrayValue == multipliedFirst) {
						entry.getValue().add(currentArrayValue);
						counter++;
					}
				}
				lastSeenValue = currentArrayValue;
			}
			triples.putAll(triplesDouble);
		}
		return counter;
	}
}
