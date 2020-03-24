package Recursion2;

/* **********

	Merge Sort
	
	Sort an array A using Merge Sort.
	Change in the input array itself. So no need to return or print anything.
	
	Input format :
	Line 1 : Integer n i.e. Array size
	Line 2 : Array elements (separated by space)
	
	Output format :
	Array elements in increasing order (separated by space)
	
	Constraints :
	1 <= n <= 1000
	
	Sample Input:
	6 
	2 6 8 5 4 3
	
	Sample Output:
	2 3 4 5 6 8

************/

/* **********

import java.util.Scanner;

public class runner {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}

************/

public class MergeSort {
    
    public static void mergeSortFunction(int[] arr, int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSortFunction(arr, start, mid);			   //left half (incl. of mid term)
		mergeSortFunction(arr, mid + 1, end);	       //right half of array
		mergeTwoSortedArrays(arr, start, end);		   //merging both sorted halves of array
		
	}
	
	public static void mergeTwoSortedArrays(int[] arr, int start, int end) {
		
		int mid = (start + end) / 2;
		int mid = (start + end) / 2;
		int[] mergedArray = new int[end - start + 1];
		int i = start, j = mid + 1;
		int k = 0;
		
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j]) {
				mergedArray[k++] = arr[i++];
			}
			else {
				mergedArray[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			mergedArray[k++] = arr[i++];
		}
		
		while(j <= end) {
			mergedArray[k++] = arr[j++];
		}
		
		for(i = 0; i < mergedArray.length; i++) {
			arr[i + start] = mergedArray[i];
		}
		
	}

	public static void mergeSort(int[] arr){
		
        int left = 0, right = arr.length - 1;
		mergeSortFunction(arr, left, right);
		
	}
}
