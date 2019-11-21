package com.learning.assignment;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class TestDqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> deque = new ArrayDeque<String>();
		ArrayDeque<String> emptydeque = new ArrayDeque<String>();
		deque.add("A");
		deque.offer("B");
		deque.offer("C");
		deque.offer("D");
		deque.offer("E");
		System.out.println(deque);
		//element()
		System.out.println(deque.element());
		//System.out.println(empytyqueue.element());
		//peek()
		System.out.println(deque.peek());
		System.out.println(emptydeque.peek());
		System.out.println(deque);
		//poll
		System.out.println(deque.poll());
		System.out.println(emptydeque.poll());
		System.out.println(deque);
		//remove
		System.out.println(deque.remove());
		//System.out.println(empytyqueue.remove());
		System.out.println(deque);
		


	}

}
