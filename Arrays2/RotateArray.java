package Arrays2;

/* **********

	Rotate array
	
	Given a random integer array of size n, write a function that rotates the given array by d elements (towards left)
	Change in the input array itself. You don't need to return or print elements.
	Input format :
	Line 1 : Integer n (Array Size)
	Line 2 : Array elements (separated by space)
	Line 3 : Integer d
	Output Format :
	Updated array elements (separated by space)
	Constraints :
	1 <= N <= 1000
	1 <= d <= N
	Sample Input :
	7
	1 2 3 4 5 6 7
	2
	Sample Output :
	3 4 5 6 7 1 2

************/

/* **********

import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
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
		int index = s.nextInt();
		ArrayRotate.rotate(arr, index);
		print(arr);
	}
}

************/

public class RotateArray {	

	public static void rotate(int[] arr, int x) {
		
      int i, j = x, n = arr.length;
		int[] arr1 = new int[n];
		for(i=0;i<arr.length;i++) {
			arr1[i] = arr[x++];
			if(x==n) {
			break;	
			}
		}
		int k = n - j;
		for(i=0;i<j;i++) {
			arr1[k++] = arr[i];
		}
      	for(i=0;i<n;i++) {
			arr[i] = arr1[i];
		}

	}
}
