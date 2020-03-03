package LinkedList2;

/* **********

	kReverse
	
	Implement kReverse( int k ) in a linked list i.e. you need to reverse first K elements then reverse next k elements and join the linked list and so on.
	Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well. If k is greater than length of LL, reverse the complete LL.
	You don't need to print the elements, just return the head of updated LL.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : k
	
	Sample Input 1 :
	1 2 3 4 5 6 7 8 9 10 -1
	4
	
	Sample Output 1 :
	4 3 2 1 8 7 6 5 10 9
	
	Sample Input 2 :
	1 2 3 4 5 -1
	2
	
	Sample Output 2 :
	2 1 4 3 5 
	
	Sample Input 3 :
	1 2 3 4 5 6 7 -1
	3
	
	Sample Output 3 :
	3 2 1 6 5 4 7

************/

/* **********

import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
public class Runner {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(Solution.kReverse(input(), s.nextInt()));
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

}

************/

public class kReverse {
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        
        LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null; 
		LinkedListNode<Integer> prev = null; 
		int count = 0; 
		/* Reverse first k nodes of linked list */ 
		while (count < k && current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
			count++; 
		} 
		if (current != null) { 
			head.next = kReverse(current, k); 
		} 
		return prev;
        
    }

}
