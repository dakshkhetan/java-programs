package Recursion2;

/* **********

	Print Subsets of Array
	
	Given an integer array (of length n), find and print all the subsets of input array.
	Subsets are of length varying from 0 to n, that contain elements of the array. 
	But the order of elements should remain same as in the input array.
	
	Note : The order of subsets are not important. Just print the subsets in different lines.
	
	Input format :
	Line 1 : Integer n, Size of array
	Line 2 : Array elements (separated by space)
	
	Constraints :
	1 <= n <= 15
	
	Sample Input:
	3
	15 20 12
	
	Sample Output:
	[] (this just represents an empty array, don't worry about the square brackets)
	12 
	20 
	20 12 
	15 
	15 12 
	15 20 
	15 20 12 

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
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.printSubsets(input);
	}
}

************/

public class PrintSubsetsOfArray {
    
    public static void printAllSubsets(int[] arr, int startIndex, int[] outputSoFar) {

		if(startIndex == arr.length) {
			for(int val : outputSoFar) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		printAllSubsets(arr, startIndex + 1, outputSoFar);		//Left call
		
		int[] newOutputSoFar = new int[outputSoFar.length + 1];
		
		for(int i = 0; i < outputSoFar.length; i++) {
			newOutputSoFar[i] = outputSoFar[i];
		}
		
		newOutputSoFar[newOutputSoFar.length - 1] = arr[startIndex];
		printAllSubsets(arr, startIndex + 1, newOutputSoFar);

	}
    
	public static void printSubsets(int input[]) {
		
        int[] outputSoFar = {};
		int startIndex = 0;
        printAllSubsets(input, startIndex, outputSoFar);

	}
}
