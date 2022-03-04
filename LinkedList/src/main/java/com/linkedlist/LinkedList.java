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
		 * PROCEDURE 1.Creating Simple Linked List 56 , 30 , 70 
		 * 2.Ability to add Linked List. 
		 * 3.Creating And Appending Linked List. 
		 * 4.Inserting Element in Between
		 * 5.Delete the first Element from LinkedLit. 
		 * 6.Delete last Node from Linked List.
		 * 7.Search Linked List to find Node With particular Value
		 * 8.Insert Element after particular node
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
		// pop();

		/*
		 * Delete last element from Linked list with popLast method
		 */
		// popLast();
		
		

		/*
		 * Print Linked List
		 */
		printList();
		
		insertMid(3,40 );
		printList();
		/*
		 * Search linked List to find node with value 30 in linked list
		 */
		searchNode(30);
	}

	/**
	 * [2] Method to Print the Linked list
	 * 1. check current node is not null
	 * 2. then print the data present in the linked List
	 * 
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
		//System.out.println(currNode);
	}

	/**
	 * [3] Method to Append data to end of the list
	 * 1. created object to pass data
	 * 2. assign newNode to null
	 * 3. check if head is null then assign head to newNode
	 * 4. else current node position to head if that not null then
	 * 5. assign current node ton next and append
	 * @param data : Here we are passing the data to Append at end of the list
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
	/**
	 * [4] Method to Insert Element in between two nodes
	 * 1. Assign currentNode to head next
	 * 2. created Node object to get data
	 * 3. current Node data is not equals to position then print data
	 * 4. assign current node to new node
	 * @param position : position to insert data
	 * @param data : Here we are passing the data to insert Between
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
	
	/**
	 * [5] Method to Delete first node 
	 * 1. assign currentNode to head next
	 * 2. then delete that node
	 * 3. assign head to current Node
	 * 
	 */
	public static void pop() {
		Node curruntNode = head.next;
		head.next = null;
		head = curruntNode;
	}

	/**
	 * [6] Method to Delete last node 
	 * 1. Here we make the pointer as head and prev to null
	 * 2. check if pointer is null or not
	 * 3. if pointer not null then assign prev to pointer and pointer to next
	 * 4. Delete the last node  
	 * @param data : Here we are passing the data to delete in Linked list
	 */
	
	public static void popLast() {
		Node pointer = head;
		Node prev = null;

		while (pointer.next != null) {
			prev = pointer;
			pointer = pointer.next;
		}
		System.out.println("Deleted node  from end :" + pointer.key);
		prev.next = null;
	}

	/**
	 * [7] Method to Search particular node 
	 * 1. Here we make the currNode as head
	 * 2. assign flag to false and i to 1  
	 * 3. Then check for head is null or not
	 * 4. IF head is null then print Null 
	 * 5. else check for data if finds then print data 
	 * @param data : Here we are passing the data to search in Linked list
	 */
	
	public static void searchNode(int data) {
		Node currNode = head;
		int i = 1;
		boolean flag = false;

		/*
		 * check if list is empty
		 */
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			while (currNode != null) {
				if (currNode.key == data) {
					flag = true;
					break;
				}
				i++;
				currNode = currNode.next;

			}
		}
		/*
		 * if element found then print that position
		 */
		if (flag) {
			System.out.println("\n" +"Element" +data+" is present  in list at position : " + i);
		}

		/*
		 * else print Element not found
		 */
		else {
			System.out.println("Element is not present at list");
		}
	}
	
	/**
	 * [8] Method to insert Element after particular node 
	 * 1. First Initialize currNode and prev to head
	 * 2. Then traverse to the end of list check position 
	 * 3. Then Update prev and current node
	 * 4. update prev node to newNode
	 * 5. Print the data
	 * @param position : Here we will pass the position of data where to insert
	 * @param data : Here we are passing the data
	 */
	
	public static void insertMid(int position, int data) {
		Node newNode = new Node(data);
		/*
		 * Initialize the currNode and prev nodes to the head
		 */
		Node currNode = head;
		Node prev = head;
		/*
		 * traverse to the end of the list and check positions moved
		 */
		while (currNode.next != null && --position > 0) {
			/*
			 * update the prev and currNode references
			 */
			prev = currNode;
			currNode = currNode.next;
		}
		/*
		 * update prev to point to new node
		 */
		prev.next = newNode;
		/*
		 * update new node to point to current node
		 */
		newNode.next = currNode;
		System.out.println("\nAdded a node with data " + data + " at the position " + position);
	}
	
}
