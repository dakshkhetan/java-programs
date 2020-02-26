package LinkedList1;

/* **********

	Insert Node Recursively
	
	Given a linked list, an integer n and a position i, Insert that node n into Linked List at ith position recursively.
	If position i is greater than length of LL, then you should return the same LL without any change. And if position i is equal to length of input LL, insert the node at last position.
	Indexing starts from 0. You don't need to print the elements, just insert and return the head of updated LL.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : Integer i (position)
	Line 3 : Integer n (Node to be inserted)
	
	Output format :
	Updated LL elements (separated by space)
	
	Sample Input 1 :
	3 4 5 2 6 1 9 -1
	3
	100
	
	Sample Output 1 :
	3 4 5 100 2 6 1 9
	
	Sample Input 2 :
	3 4 5 2 6 1 9 -1
	0
	20
	
	Sample Output 2 :
	20 3 4 5 2 6 1 9

************/

/* **********

import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		int pos = s.nextInt();
		int data = s.nextInt();
		head = Solution.insertR(head, data, pos);
		print(head);
	}
}

************/

public class InsertNodeRecursively {
	
	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
		
        if(head == null && pos != 0) {
			return head;
		}
		
		if(pos == 0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			newNode.next = head;
			head = newNode;
			return head;
		}
		else {
			LinkedListNode<Integer> subListHead = insertR(head.next, data, pos - 1);
			head.next = subListHead;
			return head;
		}
		
	}

}
