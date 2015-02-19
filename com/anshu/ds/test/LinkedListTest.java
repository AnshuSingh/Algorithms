package com.anshu.ds.test;

import com.anshu.ds.LinkedList;

public class LinkedListTest {

	public static void main(String []args){
		LinkedList ll = new LinkedList();
		System.out.println("LinkedList: "+ll);
		
		System.out.println("isLooped: "+ ll.detectLoop());
		ll.reverseLinkedList();
		System.out.println("Reverse List: "+ ll);
		ll.reverseLinkedList();
		System.out.println("Reverse again to get back original list: "+ ll);
		ll.deleteNode(ll.head.next.next.next.next.next.next.next.next);
		System.out.println("Linked list with Deleted node: "+ ll);
	}
}
