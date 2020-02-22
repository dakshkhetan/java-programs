package Recursion2;

/* **********

	Return subset of an array
	
	Given an integer array (of length n), find and return all the subsets of input array.
	Subsets are of length varying from 0 to n, that contain elements of the array. 
	But the order of elements should remain same as in the input array.
	
	Note : The order of subsets are not important.
	
	Input format :
	
	Line 1 : Size of array
	Line 2 : Array elements (separated by space)
	
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
		int output[][] = solution.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}

************/

public class ReturnSubsetOfAnArray {
    
    public static int[][] returnAllSubsets(int[] arr, int startIndex) {

		if(startIndex == arr.length) {
			int[][] baseCaseArray = {{}};
			return baseCaseArray;
		}
		
		int[][] rosSubsets = returnAllSubsets(arr, startIndex + 1);
		int[][] totalSubsets = new int[2 * rosSubsets.length][];

		int i = 0;			//i must be accessible throughout the function
		for( ; i < rosSubsets.length; i++) {
			totalSubsets[i] = new int [rosSubsets[i].length];
			for(int j = 0; j < rosSubsets[i].length; j++) {
				totalSubsets[i][j] = rosSubsets[i][j];
			}
		}

		for( int k = 0; i < totalSubsets.length; i++, k++) {
			totalSubsets[i] = new int [rosSubsets[k].length + 1];
			totalSubsets[i][0] = arr[startIndex];
			for(int j = 0; j < rosSubsets[k].length; j++) {
				totalSubsets[i][j + 1] = rosSubsets[k][j];
			}
		}
		return totalSubsets;

	}

	public static int[][] subsets(int input[]) {
        
		int startIndex = 0;
        return returnAllSubsets(input, startIndex);

	}
}