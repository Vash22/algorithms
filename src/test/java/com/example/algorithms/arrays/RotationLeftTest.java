package com.example.algorithms.arrays;

import org.junit.jupiter.api.Test;

import com.example.algorithms.arrays.RotationLeft;

import static org.assertj.core.api.Assertions.assertThat;

class RotationLeftTest {

	@Test
	public void rotLeft() {
		// given
		int[] toRotate = { 1, 2, 3, 4, 5 };

		// when
		RotationLeft rotationLeft = new RotationLeft();
		int[] rotationAdjusted = rotationLeft.rotLeft(toRotate, 4);

		// then
		assertThat(rotationAdjusted).containsExactly(5, 1, 2, 3, 4);
	}
}