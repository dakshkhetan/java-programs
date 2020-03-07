package LinkedList2;

/* **********

	Merge Sort
	
	Sort a given linked list using Merge Sort.
	You don't need to print the elements, just sort the elements and return the head of updated LL.
	
	Input format :
	Linked list elements (separated by space and terminated by -1)

	Output format :
	Updated LL elements (separated by space)
	
	Constraints :
	1 <= Length of LL <= 1000
	
	Sample Input 1 :
	1 4 5 2 -1
	
	Sample Output 1 :
	1 2 4 5

************/

/* **********

import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class Runner {
	private static Scanner s = new Scanner(System.in);

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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		print(Solution.mergeSort(input()));

	}
}

************/

public class MergeSort {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		
        if(head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> mid = findMid(head);
        LinkedListNode<Integer> temp = mid.next;
        mid.next = null;
        LinkedListNode<Integer> head1 = mergeSort(head);
        LinkedListNode<Integer> head2 = mergeSort(temp);
        head = mergeTwoSortedLists(head1, head2);
        return head;

	}

    public static LinkedListNode<Integer> mergeTwoSortedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;
        LinkedListNode<Integer> temp2 = head2;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        if(temp1.data < temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        }
        else {
            head = temp2;
            tail = temp2;
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
        if(temp1 == null) {
            tail.next = temp2;
        }
        if(temp2 == null) {
            tail.next = temp1;
        }
        return head;
    }
    
    public static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head){    
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
}
