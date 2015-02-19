package com.anshu.ds;

public class Node {

	String value;
	public Node next;
	
	Node(String val){
		this.value = val;
	}
	
	public String toString(){
		return value;
	}
}
