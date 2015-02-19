package com.anshu.ds;

public class LinkedList {

	public Node head;
	
	public LinkedList(){
		Node node1= new Node("node1");
		Node node2= new Node("node2");
		Node node3= new Node("node3");
		Node node4= new Node("node4");
		Node node5= new Node("node5");
		Node node6= new Node("node6");
		Node node7= new Node("node7");
		Node node8= new Node("node8");
		Node node9= new Node("node9");
		
		head = node1;
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = null;
		
	}
	
	/*
	 * Problem 1: detect loop in a linked list
	 * Time Complexity: O(n), Space Complexity: O(1)
	 * Demonstrates the use of fast and slow pointers.
	 */
	public boolean detectLoop(){
		if (head != null && head.next!=null){
			Node slow = head;
			Node fast = head.next.next;
			while(fast != null && fast.next != null){
				if (fast == slow)
					return true;
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return false;
	}
	
	/*
	 * Problem 2: Reverse list
	 * Time Complexity: O(n), Space Complexity: O(1)
	 * Uses 3 pointers to reverse the list.
	 */
	public void reverseLinkedList(){
		Node current = head;
		Node prev = null;
		Node temp = null;
		while (current != null){
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head = prev;
	}
	
	/*
	 * Problem 3: Delete a given node
	 * Time Complexity: O(n), Space Complexity: O(1)
	 * Copy the next node into the given node.
	 */
	public void deleteNode(Node node){
		if (node== null) return;
		if (node.next == null){
			node = null;
			return;
		}
		node.value = node.next.value;
		node.next =  node.next.next;
	}
	
	public String toString(){
		StringBuilder llString = new StringBuilder("");
		Node current = head;
		while(current != null){
			llString.append(current.value+" ");
			current = current.next;
		}
		return llString.toString();
	}
	
	
}
