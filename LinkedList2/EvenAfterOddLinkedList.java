package LinkedList2;
package LinkedList2;

/* **********

	Even after Odd LinkedList
	
	Arrange elements in a given Linked List such that, all even numbers are placed after odd numbers. Respective order of elements should remain same.
	Note: Input and Output has already managed for you. You don't need to print the elements, instead return the head of updated LL.
	
	Input format:
	Linked list elements (separated by space and terminated by -1)
	
	Output format:
	Print the elements of updated Linked list. 
	
	Sample Input 1 :
	1 4 5 2 -1
	
	Sample Output 1 :
	1 5 4 2 
	
	Sample Input 2 :
	1 11 3 6 8 0 9 -1
	
	Sample Output 2 :
	1 11 3 9 6 8 0

************/

/* **********

import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data=data;
		this.next = null;
	}
}

public class Runner {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(Solution.sortEvenOdd(input()));
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}

************/

public class EvenAfterOddLinkedList {
	
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {

        if (head == null) { 
			return head; 
		} 
		LinkedListNode<Integer> evenHead = null, oddHead = null, evenTail = null, oddTail = null; 
		while (head != null) { 
			if (head.data % 2 == 0) { 
				if (evenHead == null) { 
					evenHead = head; 
					evenTail = head; 
				} else { 
					evenTail.next = head; 
					evenTail = evenTail.next; 
				} 
			} else { 
				if (oddHead == null) { 
					oddHead = head; 
					oddTail = head; 
				} else { 
					oddTail.next = head; 
					oddTail = oddTail.next; 
				} 
			} 
			head = head.next; 
		} 
		if (oddHead == null) { 
			return evenHead; 
		} else { 
			oddTail.next = evenHead; 
		} 
		if (evenHead != null) { 
			evenTail.next = null; 
		} 
		return oddHead;
        
	}

}
