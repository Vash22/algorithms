package com.example.algorithms.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

	public int sherlockAndAnagrams(String s) {
		char[] chars = s.toCharArray();
		Map<String, Integer> helper = new HashMap<>();
		for (int i = 1; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				if (j + i > chars.length) {
					break;
				}
				String substring = s.substring(j, j + i);
				char[] toSort = substring.toCharArray();
				Arrays.sort(toSort);
				String sorted = String.valueOf(toSort);
				if (helper.containsKey(sorted)) {
					Integer actualValue = helper.get(sorted);
					actualValue = actualValue + 1;
					helper.put(sorted, actualValue);
				} else {
					helper.put(sorted, 0);
				}
			}
		}
		int sum = 0;
		for (Integer value : helper.values()) {
			for (int i = 1; i < value+1; i++) {
				sum += i;
			}
		}
		return sum;
	}
}
