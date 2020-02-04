package Arrays2;

/* **********

	Selection Sort
	
	Given a random integer array. Sort this array using selection sort.
	Change in the input array itself. You don't need to return or print elements.
	Input format :
	
	Line 1 : Array Size
	
	Line 2 : Array elements (separated by space)
	
	Sample Input 1:
	7
	2 13 4 1 3 6 28
	
	Sample Output 1:
	1 2 3 4 6 13 28
	
	Sample Input 2:
	5
	9 3 6 2 0
	
	Sample Output 2:
	0 2 3 6 9


************/

/* **********

import java.util.Scanner;

public class Main {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		SelectionSort.selectionSort(arr);
		print(arr);
	}
}

************/

public class SelectionSort {	
	
	//arr is the input array you have to sort
	
  	public static void selectionSort(int[] arr){
		int i, j, temp;
		int n = arr.length;
		for(i = 0; i < n-1; i++) {
			int minElement = arr[i];
			int minElementIndex = i;
			for(j = i + 1; j < n; j++) {
			//this loop is for finding the minimum element & not for swapping
				if(arr[j] < minElement) {
					minElement = arr[j];
					minElementIndex = j;
				}
			}
			if(i != minElementIndex) {
			//to prevent unnecessary swapping when element is already sorted
				temp = arr[i];
				arr[i] = arr[minElementIndex];
				arr[minElementIndex] = temp;
			}
		}
	}
}
