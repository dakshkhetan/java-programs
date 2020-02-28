package LinkedList1;

/* **********

	Merge Two Sorted LL
	
	Given two linked lists sorted in increasing order. Merge them in such a way that the result list is also sorted (in increasing order).
	Try solving with O(1) auxiliary space (in-place). You just need to return the head of new linked list, don't print the elements.
	
	Input format :
	Line 1 : Linked list 1 elements of length n (separated by space and terminated by -1)
	Line 2 : Linked list 2 elements of length m (separated by space and terminated by -1)
	
	Output format :
	Merged list elements (separated by space)
	
	Constraints :
	1 <= n, m <= 10^4
	
	Sample Input :
	 2 5 8 12 -1
	 3 6 9 -1
	
	Sample Output :
	 2 3 5 6 8 9 12 

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
		LinkedListNode<Integer> head1 = takeInput();
		LinkedListNode<Integer> head2 = takeInput();
		LinkedListNode<Integer> head3 = Solution.mergeTwoList(head1, head2);
		print(head3);
	}
}

************/

public class MergeTwoSortedLL {
	
	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		
        LinkedListNode<Integer> tail = null;
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> temp1 = head1;
		LinkedListNode<Integer> temp2 = head2;

		if(temp1.data < temp2.data) {
			head = tail = temp1;
			temp1 = temp1.next;
		}
		else {
			head = tail = temp2;
			temp2 = temp2.next;
		}
		
		while(temp1 != null && temp2 != null) {
			if(temp1.data < temp2.data) {
				tail.next = temp1;
				tail = temp1;
				temp1 = temp1.next;
			}
			else {
				tail.next = temp2;
				tail = temp2;
				temp2 = temp2.next;
			}
		}

		if(temp1 == null)
			tail.next = temp2;
		else
			tail.next = temp1;	
		
		return head;

	}

}
