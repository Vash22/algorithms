package com.example.algorithms;

public class RepeatedString {

	public long repeatedString(String s, long n) {
		char[] chars = s.toCharArray();
		long appearance = 0;
		long numberSignsForAdditionalCheck = n % chars.length;
		long additionalAppearance = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'a') {
				appearance++;
				if (i < numberSignsForAdditionalCheck){
					additionalAppearance++;
				}
			}
		}
		long times = n / chars.length;
		long fullTextAppearance = appearance * times ;
		return fullTextAppearance + additionalAppearance;
	}
}
