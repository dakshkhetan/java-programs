package LinkedList2;

/* **********

	Delete every N nodes
	
	Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same until end of the linked list. That is, in the given linked list you need to delete N nodes after every M nodes.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : M
	Line 3 : N
	
	Sample Input 1 :
	1 2 3 4 5 6 7 8 -1
	2
	2
	
	Sample Output 1 :
	1 2 5 6
	
	Sample Input 2 :
	1 2 3 4 5 6 7 8 -1
	2
	3
	
	Sample Output 2 :
	1 2 6 7

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
public class Main {


	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(solution.skipMdeleteN(input(), s.nextInt(), s.nextInt()));
	}

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
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

public class DeleteEveryNNodes {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

        LinkedListNode<Integer> temp1 = head;
		LinkedListNode<Integer> temp2 = null;
		while (temp1 != null) {
                int i = 1, j = 0;
                while (i < M && temp1.next != null) {
                    temp1 = temp1.next;
                    i++;
                }
                temp2 = temp1;
                while (j < N && temp2.next != null) {
                    temp2 = temp2.next;
                    j++;
                }
                temp1.next = temp2.next;
            
			temp1 = temp1.next;    //next traversal
		}
		return head;
        
	}

}
