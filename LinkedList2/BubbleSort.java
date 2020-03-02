package LinkedList2;

/* **********

	Bubble Sort
	
	Sort a given linked list using Bubble Sort (iteratively). While sorting, you need to swap the entire nodes, not just the data.
	You don't need to print the elements, just sort the elements and return the head of updated LL.
	
	Input format : Linked list elements (separated by space and terminated by -1)`
	
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
	private static Scanner s= new Scanner(System.in);
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
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(Solution.bubbleSort(input()));
	}
}

************/

public class BubbleSort {
	
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head ) {
        
		 for(int i = 0; i < length(head) - 1; i++) {
           LinkedListNode<Integer> prev = null;
           LinkedListNode<Integer> current = head;
           LinkedListNode<Integer> next = current.next;
            
           while(current.next != null) {
               if(current.data > current.next.data) {
                   
                   if(prev != null)
                       prev.next = current.next;
                   else
                       head = next; //Head updation
                   
                   current.next = next.next;
                   next.next = current;
                   
                   prev = next;
                   next = current.next;
               }
               else {
                   prev = current;
                   current = next;
                   next = current.next;
               }
           }
       }
       return head;
   }
       

   
    public static int length(LinkedListNode<Integer> head) {
       if(head == null) {
           return 0;
       }
       int smallAns = length(head.next);
       int result = 1 + smallAns;
       return result;
   }

}
