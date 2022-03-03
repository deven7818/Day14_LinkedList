package com.linkedlist;

public class Node {

	public int key;
	public Node next;

	public Node(int key) {
		this.key = key;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}