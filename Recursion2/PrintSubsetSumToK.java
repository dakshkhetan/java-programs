package Recursion2;

/* **********

	Print Subset Sum to K
	
	Given an array A and an integer K, print all subsets of A which sum to K.
	Subsets are of length varying from 0 to n, that contain elements of the array. 
	But the order of elements should remain same as in the input array.
	
	Note : The order of subsets are not important. Just print them in different lines.
	
	Input format :
	Line 1 : Size of input array
	Line 2 : Array elements separated by space
	Line 3 : K 
	
	Sample Input:
	9 
	5 12 3 17 1 18 15 3 17 
	6
	
	Sample Output:
	3 3
	5 1

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
		int k = s.nextInt();
		solution.printSubsetsSumTok(input, k);
	}
}

************/

public class PrintSubsetSumToK {
    
    public static void printSubsetsSumToK(int[] arr, int k, int startIndex, int[] outputSoFar) {

		if(startIndex == arr.length) {
			if(k == 0) {
				for(int val : outputSoFar) {
					System.out.print(val + " ");
				}
				System.out.println();
			}
			return;
		}

		printSubsetsSumToK(arr, k, startIndex + 1, outputSoFar);		

		int[] newOutputSoFar = new int[outputSoFar.length + 1];

		for(int i = 0; i < outputSoFar.length; i++) {
			newOutputSoFar[i] = outputSoFar[i];
		}

		newOutputSoFar[newOutputSoFar.length - 1] = arr[startIndex];
		printSubsetsSumToK(arr, k - arr[startIndex], startIndex + 1, newOutputSoFar);

	}
    
	public static void printSubsetsSumTok(int input[], int k) {
		
        int[] outputSoFar = {};
		int startIndex = 0;
        printSubsetsSumToK(input, k, startIndex, outputSoFar);
		
	}
}
