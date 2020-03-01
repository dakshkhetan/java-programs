package LinkedList2;

/* **********

	Nth Node from last
	
	Given a linked list and an integer n you need to find and return the nth node from last without calculating length of input linked list.
	Return null if length of LL is smaller than n.
	Counting of nodes starts from 0.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : Integer n 
	
	Output format :
	nth node from last
	
	Sample Input 1 :
	3 4 5 2 6 1 9 -1
	0
	
	Sample Output 1 :
	9
	
	Sample Input 2 :
	3 4 5 2 6 1 9 -1
	4
	
	Sample Output 2 :
	5

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
	

	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		int n = s.nextInt();
		head = Solution.nthNodeFromLastIter(head, n);
		System.out.println(head==null?"":head.data);
	}
}

************/

public class NthNodeFromLast {
	
	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n) {
		
        int i;
        LinkedListNode<Integer> temp = reverse(head);
        for(i = 0; temp != null; i++) {
            if(i == n) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
	}
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> temp = head.next;
        LinkedListNode<Integer> sA = reverse(head.next);
        temp.next = head;
        head.next = null;
        return sA;
    }

}
