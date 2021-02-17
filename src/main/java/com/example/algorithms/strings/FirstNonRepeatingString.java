package com.example.algorithms.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingString {

	public static char find(String givenText) {
		Map<Character, Long> charsAppearance = givenText.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		return givenText.chars().mapToObj(c -> (char) c).filter(s -> charsAppearance.get(s) <= 1).findFirst().orElse('_');
	}
}
