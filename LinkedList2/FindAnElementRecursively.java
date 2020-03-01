package LinkedList2;

/* **********

	Find an Element Recursively
	
	Given a linked list and an integer n you need to find and return index where n is present in the LL. Do this recursively.
	Return -1 if n is not present in the LL.
	Indexing of nodes starts from 0.
	
	Input format :
	Line 1 : Linked list elements (separated by space and terminated by -1)
	Line 2 : Integer n 
	
	Output format :
	Index
	
	Sample Input 1 :
	3 4 5 2 6 1 9 -1
	5
	
	Sample Output 1 :
	2
	
	Sample Input 2 :
	3 4 5 2 6 1 9 -1
	6
	
	Sample Output 2 :
	4

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
		System.out.println(Solution.indexOfNRec(head, n));
	}
}

************/

public class FindAnElementRecursively {
	
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
      
		if(head == null){
			return -1;
	    }
	    
		if(head.data.equals(n)){
			return 0;
	    }
		
		int i = indexOfNRec(head.next, n);
		
		if(i != -1){
			return i + 1;
		} else {
			return -1;
		}
      
	}
	
//	public static int findRecursively(LinkedListNode<Integer> head, int data, int index) {
//        if(head == null) {
//            return -1;
//        }
//         
//        if(head.data == data) {
//            return index;
//        }
//        else {
//            int retVal = findRecursively(head.next, data, index + 1);
//            return retVal;
//        }
//    }
//    
//	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
//        return findRecursively(head, n, 0);
//	}

}
