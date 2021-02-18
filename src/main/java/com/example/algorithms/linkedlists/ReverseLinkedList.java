package com.example.algorithms.linkedlists;

import java.util.LinkedList;

public class ReverseLinkedList {

	static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

		DoublyLinkedListNode actual = head;
		DoublyLinkedListNode newHead = null;
		while (actual != null) {
			newHead = actual;
			actual = actual.next;

			DoublyLinkedListNode nextElement = newHead.next;
			newHead.next = newHead.prev;
			newHead.prev = nextElement;
		}
		return newHead;
	}


	static DoublyLinkedListNode reverse2(DoublyLinkedListNode head) {

		while (head != null){
			DoublyLinkedListNode nextNode = head.next;
			head.next = head.prev;
			head.prev = nextNode;

			if (nextNode == null){
				break;
			}
			head = nextNode;
		}

		return head;
	}
}












