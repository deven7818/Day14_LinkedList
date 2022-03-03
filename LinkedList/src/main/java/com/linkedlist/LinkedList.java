package com.linkedlist;

public class LinkedList {

	private static Node head;

	/**
	 * Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 */
	/**
	 * appendList - this method is created to add data to linedList
	 *
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 *
	 */

	public static void main(String[] args) {

		/*
		 * PROCEDURE 1.Creating Simple Linked List 56 , 30 , 70 2.Ability to add Linked
		 * List 3.creating And Appending Linked List
		 */

		/*
		 * Creating Link List by Appending 30 and 70 to 56
		 */
		appendList(56);
		appendList(30);
		appendList(70);
		printList();
	}

	/*
	 * Print the linked list
	 */
	public static void printList() {
		Node currNode = head;
		System.out.print("Linked List ");

		/*
		 * if CurrNode not null then print current Node
		 */
		while (currNode != null) {
			System.out.print(currNode.key + " ");
			currNode = currNode.next;

		}
		/*
		 * Printing Linked List
		 */
		System.out.println(currNode);
	}

	/*
	 * Appending element to next new node
	 */
	public static void appendList(int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

}