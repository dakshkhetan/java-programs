package Arrays2;

/* **********

	Bubble Sort
	
	Given a random integer array. Sort this array using bubble sort.
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
		BubbleSort.bubbleSort(arr);
		print(arr);
	}
}

************/

public class BubbleSort {	
	
	//arr is the input array you have to sort
	
  	public static void bubbleSort(int[] arr){
		int i, temp, round;
		int n = arr.length;
		for(round = 1; round < n; round++) {
			for(i=0; i<n-1; i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
}
