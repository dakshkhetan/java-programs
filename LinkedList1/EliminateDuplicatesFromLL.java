package LinkedList1;

/* **********

	Eliminate duplicates from LL
	
	Given a sorted linked list (elements are sorted in ascending order). Eliminate duplicates from the given LL, such that output LL contains only unique elements.
	You don't need to print the elements, just remove duplicates and return the head of updated LL.
	
	Input format : Linked list elements (separated by space and terminated by -1)
	
	Sample Input 1 :
	1 2 3 3 3 4 4 5 5 5 7 -1
	
	Sample Output 1 :
	1 2 3 4 5 7

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
		print(Solution.removeDuplicates(input()));
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
		while (data != -1) {
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

public class EliminateDuplicatesFromLL {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

 	// Iterative approach:
        LinkedListNode<Integer> temp = head;
        
        if(head == null){
            return null;
        }
        
        while(temp.next != null) {
            if(temp.data.equals(temp.next.data)){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        
        return head;


        // Recursive approach:
        if(head == null || head.next == null)
			return head;
		
		LinkedListNode<Integer> subListHead = removeDuplicates(head.next);
		
		if((int)head.data == (int)subListHead.data) {
			head.next = subListHead.next;
		}
		
		return head;
        
    }

}
