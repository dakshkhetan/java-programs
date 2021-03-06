package LinkedList1;

/* **********

	Reverse LL (Iterative)
	
	Given a linked list, reverse it iteratively.
	You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL.
	
	Input format : Linked list elements (separated by space and terminated by -1)`
	
	Sample Input 1 :
	1 2 3 4 5 -1
	
	Sample Output 1 :
	5 4 3 2 1

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
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(Solution.reverse_I(input()));
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

public class ReverseLLIterative {
	
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> previous = null;
		while(current != null) {
			LinkedListNode<Integer> next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
		
	}

}
