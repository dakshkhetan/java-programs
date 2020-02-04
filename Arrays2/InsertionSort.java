package Arrays2;

/* **********

	Insertion Sort
	
	Given a random integer array. Sort this array using insertion sort.
	Change in the input array itself. You don't need to return or print elements.
	Input format :
	Line 1 : Integer N, Array Size
	Line 2 : Array elements (separated by space)
	Constraints :
	1 <= N <= 10^3
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
		InsertionSort.insertionSort(arr);
		print(arr);
	}
}

************/

public class InsertionSort {	
	
  	public static void insertionSort(int[] arr){
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int j = i;
			while(j >= 1 && arr[j-1] > arr[j]) {  //j should be >=1 to prevent error & should 
				int temp = arr[j-1];			  //be written prior to the other condition
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
}