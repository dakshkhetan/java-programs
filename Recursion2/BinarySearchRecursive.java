package Recursion2;

/* **********

	Binary Search (Recursive)
	
	Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
	Return -1 if x is not present in the given array.
	Note : If given array size is even, take first mid.
	
	Input format :
	
	Line 1 : Array size
	
	Line 2 : Array elements (separated by space)
	
	Line 3 : x (element to be searched)
	
	Sample Input :
	6
	2 3 4 5 6 8 
	5 
	
	Sample Output:
	3 

************/

/* **********

import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(solution.binarySearch(input, element));
	}
}

************/

public class BinarySearchRecursive {

	public static int binary_Search(int[] arr, int element, int left, int right) {

		if(left > right) {
			return -1;
		}

		int mid = (left + right) / 2;

		if(element == arr[mid]) {
			return mid;
		}
		else if (element < arr[mid]) {
			int index = binary_Search(arr, element, left, mid - 1);
			return index;
		}
		else {
			int index = binary_Search(arr, element, mid + 1, right);
			return index;
		}
	}
    
	public static int binarySearch(int input[], int element) {
		
        int left = 0;
		int right = input.length - 1;
        return binary_Search(input, element, left, right);

	}
}