package com.algorithms.hackerrank.hashmaps;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoSubstrings {

	public String twoStrings(String s1, String s2) {
		Set<String> distinctFirst = Arrays.stream(s1.split("")).collect(Collectors.toSet());
		for (String s : s2.split("")) {
			if (distinctFirst.contains(s)) {
				return "Yes";
			}
		}
		return "No";
	}
}
