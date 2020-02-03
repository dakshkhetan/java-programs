package Arrays1;

/* **********

	Sort 0 1
	
	You are given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array.
	You need to change in the given array itself. So no need to return or print anything.
	Input format :
	Line 1 : Integer N (Array Size)
	Line 2 : Array elements (separated by space)
	Output format :
	Sorted array elements
	Constraints :
	1 <= N <= 10^6
	Sample Input :
	7
	0 1 1 0 1 0 1
	Sample Output :
	0 0 0 1 1 1 1

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

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		SortBinaryArray.sortBinaryArray(arr);
		print(arr);
	}
}

************/

public class Sort01{	

	public static void sortBinaryArray(int[] arr){
		
      	int n = arr.length;
      	int[] temp = new int[n];
		int i, nz = 0, nt = n-1;
		for(i=0; i<n; i++) {
			if(arr[i]==0) {
				temp[nz++] = arr[i];
			}
			else if(arr[i]==1) {
				temp[nt--] = arr[i];
			}
			
		}
		
		for(i=0; i < n; i++) {
			arr[i]=temp[i];
		}

	}
}
