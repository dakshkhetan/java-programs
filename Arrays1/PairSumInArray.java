package Arrays1;

/* **********

	Pair sum in array
	
	Given a random integer array A and a number x. Find and print the pair of elements in the array which sum to x.
	Array A can contain duplicate elements.
	While printing a pair, print the smaller element first.
	That is, if a valid pair is (6, 5) print "5 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.
	Input format :
	Line 1 : Integer N (Array size)
	Line 2 : Array elements (separated by space)
	Line 3 : Integer x
	Output format :
	Line 1 : Pair 1 elements (separated by space)
	Line 2 : Pair 2 elements (separated by space)
	Line 3 : and so on
	Constraints :
	1 <= N <= 1000
	1 <= x <= 100
	Sample Input:
	9
	1 3 6 2 5 4 3 2 4
	7
	Sample Output :
	1 6
	3 4
	3 4
	2 5
	2 5
	3 4
	3 4

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
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		PairSum.pairSum(arr, num);
	}
}

************/

public class PairSumInArray {	

	public static void pairSum(int[] arr, int sum) {
		
      	// we don't need to sort the given array    
      	int n = arr.length;
		int a, b;
		for (int i = 0; i < n - 1; i++) { 
			for (int j = i + 1; j < n; j++) { 
				if (arr[i] + arr[j] == sum) {
					if(arr[j] < arr[i]) {
						a = arr[j];
						b = arr[i];
					}
					else {
						a = arr[i];
						b = arr[j];
					}
					System.out.println(a + " " + b); 
				}
			} 
		}
        
    }
}
