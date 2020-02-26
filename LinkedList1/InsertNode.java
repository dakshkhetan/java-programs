package LinkedList1;

/* **********

	Insert Node
	
	Given a linked list, an integer n and a position i, insert that node n into Linked List at ith position.
	If position i is greater than length of LL, you should return the same LL without any change.
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

class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
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
	
	public static void print(Node<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int pos = s.nextInt();
		int data = s.nextInt();
		head = Solution.insert(head, data, pos);
		print(head);
	}
}

************/

public class InsertNode {
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		
        if(pos < 0 || pos >= length(head)) {
			return head;
		}
		else {
			Node<Integer> newNode = new Node<Integer>(data);
			if(pos == 0) {
				newNode.next = head;
				head = newNode;
			}
			else {
				int i = 0;
				Node<Integer> temp = head;
				while(i < pos - 1) {
					i++;
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next = newNode;
			}
			return head;
		}
		
	}

}
