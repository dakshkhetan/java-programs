package Arrays1;

/* **********

	Print Array intersection
	
	Given two random integer arrays, print their intersection. That is, print all the elements that are present in both the given arrays.
	Input arrays can contain duplicate elements.
	Note : Order of elements are not important
	Input format :
	Line 1 : Integer N, Array 1 Size
	Line 2 : Array 1 elements (separated by space)
	Line 3 : Integer M, Array 2 Size
	Line 4 : Array 2 elements (separated by space)
	Output format :
	Print intersection elements in different lines
	Constraints :
	1 <= M, N <= 10^6
	Sample Input 1 :
	6
	2 6 8 5 4 3
	4
	2 3 4 7 
	Sample Output 1 :
	2 
	4 
	3
	Sample Input 2 :
	4
	2 6 1 2
	5
	1 2 3 4 2
	Sample Output 2 :
	2 
	2
	1

************/

/* **********

import java.util.ArrayList;
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

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		Intersection.intersection(arr1, arr2);
	}
}

************/

public class PrintArrayIntersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		//arr1 should be always smaller than arr2 to prevent exceptions
		 if (n1 > n2) { 
			int temp[] = arr1; 
			arr1 = arr2; 
			arr2 = temp; 

			int temp_size = n1; 
			n1 = n2; 
			n2 = temp_size; 
		} 

		//finding intersection by comparing both arrays
		for(int i=0; i < n1; i++) {
			for(int j = 0; j < n2; j++) { 
				if (arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
					break;		//to prevent printing duplicate elements
				} 
			} 
		}
	}
}