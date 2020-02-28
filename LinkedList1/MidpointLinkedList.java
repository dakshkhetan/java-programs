package LinkedList1;

/* **********

	Midpoint LinkedList
	
	Given a linked list, find and return the midpoint.
	If the length of linked list is even, return the first mid point.
	
	Input format : Linked list elements (separated by space and terminated by -1)`
	
	Sample Input 1 :
	1 2 3 4 5 -1
	
	Sample Output 1 :
	3
	
	Sample Input 2 :
	1 2 3 4 -1
	
	Sample Output 2 :
	2

************/

/* **********

import java.util.Scanner;

public class Runner {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(Solution.printMiddel(input()) + "");
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

************/

public class MidpointLinkedList {

	public static int printMiddel(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;

		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
        
    }
	
}
