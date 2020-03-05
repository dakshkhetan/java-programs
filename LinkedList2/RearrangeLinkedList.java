package LinkedList2;

/* **********

	Rearrange linked list
	
	Given a singly linked list L : L0→L1→…→Ln-1→Ln . Rearrange the nodes in the list so that the new formed list is : L0→Ln→L1→Ln-1→L2→Ln-2→…
	You are required do this in-place without altering the nodes' values.
	You just need to return the head of new linked list, don't print the elements.
	
	Input format :
	Line 1 : Linked list elements of length n (separated by space and terminated by -1)
	
	Output format :
	Updated list elements (separated by space)
	
	Constraints :
	1 <= n <= 10^4
	
	Sample Input :
	2 5 8 12 -1
	Note : -1 at the end of input is just a terminator representing the end of linked list. This -1 is not part of the linked list. Size of given linked list is 4.
	
	Sample Output :
	2 12 5 8

************/

/* **********

import java.util.Scanner;

class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}


public class runner {

	static Scanner s=new Scanner(System.in);	

	public static ListNode<Integer> createlist()
	   {
		   ListNode<Integer> head=null;
		   ListNode<Integer> rear=null;
		   int data=s.nextInt();
		   while(data!=-1)
		   {
			   ListNode<Integer> newnode=new ListNode<Integer>(data);
			   if(head==null)
			   {
				   head=newnode;
				   rear=head;
			   }
			   else
			   {
				   rear.next=newnode;
				   rear=rear.next;
			   }
			   data=s.nextInt();
		   }
		   return head;
	   }
	 public static void print(ListNode<Integer> head)
	   {
		   while(head!=null)
		   {
			   System.out.print(head.data+" ");
			   head=head.next;
		   }
	   }

	public static void main(String[] args) {
   		ListNode<Integer> head=createlist();
   		head = solution.changelist(head);
   		print(head);
	}

}

************/

public class RearrangeLinkedList {
	
	public static ListNode<Integer> changelist(ListNode<Integer> head) {
		
        ListNode<Integer> temp1 = head;
        ListNode<Integer> midpoint = middleNode(head);
        ListNode<Integer> temp2 = midpoint.next;

        temp2 = reverse_I(temp2);
        midpoint.next = null;
        
        while (temp2 != null) {
            ListNode<Integer> aux1 = temp1.next;
            ListNode<Integer> aux2 = temp2.next;

            temp1.next = temp2;
            temp2.next = aux1;
            temp1 = aux1;
            temp2 = aux2;
        }
        return head;
	}
    
    public static ListNode<Integer> middleNode(ListNode<Integer> head) {
        
        ListNode<Integer> slow = head;
		ListNode<Integer> fast = head;

		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
        
    }
    
    public static ListNode<Integer> reverse_I(ListNode<Integer> head) {
        
        ListNode<Integer> current = head;
		ListNode<Integer> previous = null;
		while(current != null) {
			ListNode<Integer> next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
		return previous;
		
	}

}
