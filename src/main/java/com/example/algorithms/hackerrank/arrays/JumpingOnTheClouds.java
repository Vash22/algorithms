package com.example.algorithms.hackerrank.arrays;

public class JumpingOnTheClouds {

	public int jumpingOnClouds(int[] c) {
		int numberOfJumps = 0;
		for (int i = 0; i < c.length; ) {
			if (i + 2 < c.length && c[i + 2] == 0) {
				i += 2;
				numberOfJumps++;
			} else if (i + 1 < c.length && c[i + 1] == 0) {
				i++;
				numberOfJumps++;
			} else {
				break;
			}
		}
		return numberOfJumps;
	}
}
