package LinkedList1;

/* **********

	Print ith Node
	
	Given a linked list and a position i, print the node at ith position.
	If position i is greater than length of LL, then don't print anything.
	Indexing starts from 0.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : Integer i (position)
	
	Output format :
	Element at ith position
	
	Sample Input 1 :
	3 4 5 2 6 1 9 -1
	3
	
	Sample Output 1 :
	2
	
	Sample Input 2 :
	3 4 5 2 6 1 9 -1
	0
	
	Sample Output 2 :
	3

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
		Solution.printIth(head, pos);
	}
}

************/

public class PrintithNode {
	
public static void printIth(LinkedListNode<Integer> head, int pos){
		
        if(pos < 0 || pos > length(head)) {
			return;
		}		
		else {
			int i = 0;
			LinkedListNode<Integer> temp = head;
			while(i < pos) {
				i++;
				temp = temp.next;
            }
			System.out.println(temp.data);
		}
		
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
