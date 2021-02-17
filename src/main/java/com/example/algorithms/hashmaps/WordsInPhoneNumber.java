package com.example.algorithms.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WordsInPhoneNumber {

	private final static Map<Character, String> pad = new HashMap<>();
	static {
		pad.put('a', "2");
		pad.put('b', "2");
		pad.put('c', "2");
		pad.put('d', "3");
		pad.put('e', "3");
		pad.put('f', "3");
		pad.put('g', "4");
		pad.put('h', "4");
		pad.put('i', "4");
		pad.put('j', "5");
		pad.put('k', "5");
		pad.put('l', "5");
		pad.put('m', "6");
		pad.put('n', "6");
		pad.put('o', "6");
		pad.put('p', "7");
		pad.put('q', "7");
		pad.put('r', "7");
		pad.put('s', "7");
		pad.put('t', "8");
		pad.put('u', "8");
		pad.put('v', "8");
		pad.put('w', "9");
		pad.put('x', "9");
		pad.put('y', "9");
		pad.put('z', "9");
	}

	public String[] computeWitchWordsAreInPhoneNumber(String phoneNumber, String[] words) {
		char[] phoneDivided = phoneNumber.toCharArray();

		Set<String> allNumbers = new HashSet<>();
		for (int i = 0; i < phoneDivided.length; i++) {
			for (int j = i + 1; j < phoneDivided.length; j++) {
				allNumbers.add(phoneNumber.substring(i, j));
			}
		}
		Map<String, List<String>> numberPointingToWord = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String number = words[i].chars().mapToObj(c -> (char) c).map(pad::get).collect(Collectors.joining(""));
			List<String> alreadyExistingWords = numberPointingToWord.get(number);
			if (alreadyExistingWords == null) {
				alreadyExistingWords = new ArrayList<>();
			}
			alreadyExistingWords.add(words[i]);
			numberPointingToWord.put(number, alreadyExistingWords);
		}
		List<String> result = new ArrayList<>();
		numberPointingToWord.forEach((k, v) -> {
			if (allNumbers.contains(k)) {
				result.addAll(v);
			}
		});
		String[] convertedResult = new String[result.size()];
		return result.toArray(convertedResult);
	}
}
