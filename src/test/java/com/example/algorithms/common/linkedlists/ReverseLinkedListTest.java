package com.example.algorithms.common.linkedlists;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

	@Test
	void reverse() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.insertNode(3);
		doublyLinkedList.insertNode(6);
		doublyLinkedList.insertNode(4);
		doublyLinkedList.insertNode(9);
		doublyLinkedList.insertNode(32);

		DoublyLinkedListNode reversed = ReverseLinkedList.reverse(doublyLinkedList.head);

		ArrayList<Integer> values = new ArrayList<>();
		while (reversed != null) {
			values.add(reversed.data);
			reversed = reversed.next;
		}
		assertThat(values).containsExactly(32, 9, 4, 6, 3);
	}

	@Test
	void reverse2() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.insertNode(3);
		doublyLinkedList.insertNode(6);
		doublyLinkedList.insertNode(4);
		doublyLinkedList.insertNode(9);
		doublyLinkedList.insertNode(32);

		DoublyLinkedListNode reversed = ReverseLinkedList.reverse2(doublyLinkedList.head);

		ArrayList<Integer> values = new ArrayList<>();
		while (reversed != null) {
			values.add(reversed.data);
			reversed = reversed.next;
		}
		assertThat(values).containsExactly(32, 9, 4, 6, 3);
	}
}