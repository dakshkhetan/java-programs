package LinkedList1;

/* **********

	Print reverse LinkedList
	
	Print a given linked list in reverse order. You need to print the tail first and head last. You can’t change any pointer in the linked list, just print it in reverse order.
	
	Input format : Linked List elements (separated by space and terminated by -1)
	
	Output format : Linked List elements in reverse order (separated by space)
	
	Sample Input 1 :
	1 2 3 4 5 -1
	
	Sample Output 1 :
	5 4 3 2 1
	
	Sample Input 2 :
	1 2 3 -1
	
	Sample Output 2 :
	3 2 1

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
	private static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		Solution.printReverseRecursive(input());
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

public class PrintReverseLinkedList {
	
	public static void printReverseRecursive(LinkedListNode<Integer> head) {
        
        if(head == null) {
			return;
		}
		printReverseRecursive(head.next);
		System.out.print(head.data + " ");
        
    }

}
