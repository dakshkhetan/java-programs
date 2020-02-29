package LinkedList1;

/* **********

	Swap two Node of LL
	
	Given a linked list, i & j, swap the nodes that are present at i & j position in the LL. You need to swap the entire nodes, not just the data.
	Indexing starts from 0. You don't need to print the elements, just swap and return the head of updated LL.
	Assume i & j given will be within limits. And i can be greater than j also.
	
	Input format :
	
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : i and j (separated by space)
	
	Sample Input 1 :
	3 4 5 2 6 1 9 -1
	3 4
	
	Sample Output 1 :
	3 4 5 6 2 1 9
	
	Sample Input 2 :
	3 4 5 2 6 1 9 -1
	2 4
	
	Sample Output 2 :
	3 4 6 2 5 1 9

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
		print(Solution.swap_nodes(input(), s.nextInt(), s.nextInt()));
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
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

}

************/

public class SwapTwoNodeOfLL {
	
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) {
		
        LinkedListNode<Integer> temp = head, prev = null; 
		LinkedListNode<Integer> node1 = null, node2 = null, node1_prev = null, node2_prev = null; 
		int pos = 0; 
		while(temp != null) { 
			if(pos == i) { 
				node1_prev = prev; 
				node1 = temp; 
			} else if (pos == j) { 
				node2_prev = prev; 
				node2 = temp; 
			} 
			prev = temp; 
			temp = temp.next; 
			pos++; 
		}
		if(node1_prev != null) { 
			node1_prev.next = node2; 
		} else { 
			head = node2; 
		} 
		if(node2_prev != null) { 
			node2_prev.next = node1; 
		} else { 
			head = node1; 
		} 
		LinkedListNode<Integer> temp1 = node2.next; 
		node2.next = node1.next; 
		node1.next = temp1; 
		return head;
        
	}

}
