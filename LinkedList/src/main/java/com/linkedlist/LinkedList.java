package com.linkedlist;

public class LinkedList {

	private static Node head;

	
	/**
	* Main method for manipulation linkedList
	* @param args - Default Java param (Not used)
	*/
	
	public static void main(String[] args) {
		
		/*
		 * PROCEDURE
		 * 1.Creating Simple Linked List 56 , 30 , 70
		 */
		
		/*
		 * Creating Linked List
		 */
		LinkedList linkedList = new LinkedList();
		
		/*
		 * Adding Nodes to LinkedList
		 */
		linkedList.head = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);
		linkedList.head.next = secondNode;
		secondNode.next = thirdNode;
		printList();
	}
	/*
	 * Print the linked list
	 */
	public static void printList() {
		Node currNode = head;
		System.out.print("Linked List " );
		
		/*
		 * if CurrNode not null then print current Node
		 */
		while(currNode != null) {
			System.out.print(currNode.key + " ");
			currNode= currNode.next;
			
		}
		/*
		 * Printing Linked List
		 */
		System.out.println(currNode);
	}

}