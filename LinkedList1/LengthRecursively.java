package LinkedList1;

/* **********

	Length Recursively
	
	Given a linked list, find and return the length of input LL recursively.
	
	Input format :
	Linked list elements (separated by space and terminated by -1)
	
	Output format :
	Length of LL
	
	Sample Input :
	3 4 5 2 6 1 9 -1
	
	Sample Output :
	7

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
		System.out.println(Solution.length(head));
	}
}

************/

public class LengthRecursively {

	public static int length(LinkedListNode<Integer> head){
		
        if(head == null) {
			return 0;
		}

		int smallAns = length(head.next);
		return smallAns + 1;
		
	}

}
