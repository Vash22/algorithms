package com.example.algorithms.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

	@Deprecated // need to fix algorithm
	public long countTriplets(List<Long> arr, long r) {
		Map<Integer, List<Long>> triples = new HashMap<>();

		int counter = 0;
		for (int i = 0; i < arr.size(); i++) {
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
					Long second = entry.getValue().get(1);
					long multipliedFirst = second * r;
					if (currentArrayValue == multipliedFirst) {
						entry.getValue().add(currentArrayValue);
						counter++;
					}
				}
			}
		}
		return counter;
	}
}
