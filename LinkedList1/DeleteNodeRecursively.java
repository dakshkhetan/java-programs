package LinkedList1;

/* **********

	Delete Node Recursively
	
	Given a linked list and a position i, delete the node of ith position from Linked List recursively.
	If position i is greater than length of LL, then you should return the same LL without any change.
	Indexing starts from 0. You don't need to print the elements, just delete the node and return the head of updated LL.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : Integer i (position)
	
	Output format :
	Updated LL elements (separated by space)
	
	Sample Input 1 :
	3 4 5 2 6 1 9 -1
	3
	
	Sample Output 1 :
	3 4 5 6 1 9
	
	Sample Input 2 :
	3 4 5 2 6 1 9 -1
	0
	
	Sample Output 2 :
	4 5 2 6 1 9

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
		head = Solution.deleteIthNodeRec(head, pos);
		print(head);
	}
}

************/

public class DeleteNodeRecursively {
	
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int pos){
		
        if(pos == 0) {
			head = head.next;
		}
		else if(pos >= length(head)) {
			return head;
		}
		else {
			LinkedListNode<Integer> temp = head;
			int i = 0;
			while(i < pos - 1) {
				i++;
				temp = temp.next;	
			}
			temp.next = temp.next.next;
		}
		return head;
		
	}
    
    public static int length(LinkedListNode<Integer> head) {

		int count = 0;
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;

	}

}
