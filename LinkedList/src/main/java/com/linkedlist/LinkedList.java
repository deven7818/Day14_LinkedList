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
		 * PROCEDURE 
		 * 1.Creating Simple Linked List 56 , 30 , 70 
		 * 2.Ability to add Linked List.
		 * 3.Creating And Appending Linked List. 
		 * 4.Inserting Element in Between
		 * 5.Delete the first Element from LinkedLit. 
		 * 6.Delete last Node from Linked List
		 * 
		 */

		/*
		 * Creating Link List by Appending 30 and 70 to 56
		 */
		appendList(56);
		appendList(30);
		appendList(70);

		/*
		 * insert 30 between 56 and 70
		 */
		// insertBetween(56, 30);

		
		/*
		 * Delete first element from Linked List
		 */
		 pop();

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

	/*
	 * method to insert between elements
	 */
	public static void insertBetween(int position, int data) {
		Node curruntNode = head;
		Node newNode = new Node(data);

		while (curruntNode.key != position) {
			System.out.println(curruntNode.key);
			curruntNode = curruntNode.next;
		}
		newNode.next = curruntNode.next;
		curruntNode.next = newNode;
	}

	/*
	 * pop Method to delete first Element from Linked List
	 */
	public static void pop() {
		Node curruntNode = head.next;
		head.next = null;
		head = curruntNode;
	}



}
