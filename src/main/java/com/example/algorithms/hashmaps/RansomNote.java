package com.example.algorithms.hashmaps;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RansomNote {

	public String checkMagazine(String[] magazine, String[] note) {
		Map<String, Long> magazineWords = Arrays.stream(magazine).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		for (String wordFromNote : note) {
			if (magazineWords.containsKey(wordFromNote)){
				Long amountOfThisTypeOfWords = magazineWords.get(wordFromNote);
				if (amountOfThisTypeOfWords <= 0){
					return "No";
				}
				long difference = amountOfThisTypeOfWords - 1;
				magazineWords.put(wordFromNote, difference);
			} else {
				return "No";
			}
		}
		return "Yes";
	}
}
