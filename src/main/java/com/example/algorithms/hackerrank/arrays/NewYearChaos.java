package com.example.algorithms.hackerrank.arrays;

public class NewYearChaos {

	public String minimumBribes(int[] q) {
		for (int i = 0; i < q.length; i++) {
			int differance = q[i] - (i + 1);
			if (differance > 2) {
				return "Too chaotic";
			}
		}

		int amount=0;
		for (int i = 1; i < q.length; i++) {
			int current = q[i];
			int beforeIndex = i - 1;
			while(beforeIndex >= 0 && current < q[beforeIndex]) {
				amount++;
				q[beforeIndex+1] = q[beforeIndex];
				beforeIndex--;
			}
			q[beforeIndex+1] = current;
		}

		return String.valueOf(amount);
	}
}
