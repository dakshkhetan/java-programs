package LinkedList1;

/* **********

	Palindrome LinkedList
	
	Check if a given linked list is palindrome or not. Return true or false.
	Indexing starts from 0.
	
	Input format : Linked list elements (separated by space and terminated by -1)`
	
	Sample Input 1 :
	9 2 3 3 2 9 -1
	
	Sample Output 1 :
	true
	
	Sample Input 2 :
	0 2 3 2 5 -1
	
	Sample Output 2 :
	false

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
		System.out.print(Solution.isPalindrome_2(input()));
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

public class PalindromeLinkedList {
	
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
	       
        LinkedListNode<Integer> mid = findMiddle(head);
		LinkedListNode<Integer> temp = mid.next;
		mid.next = null;
		temp = reverse_I(temp);
		LinkedListNode<Integer> temp1 = head;
		LinkedListNode<Integer> temp2 = temp;
		while(temp2 != null) {
			if(temp1.data != temp2.data)
				return false;
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return true;
        
    }
    
    public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head) {

		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;

		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}
    
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
