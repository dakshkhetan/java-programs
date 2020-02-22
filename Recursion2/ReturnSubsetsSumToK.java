package Recursion2;

/* **********

	Return subsets sum to K
	
	Given an array A of size n and an integer K, return all subsets of A which sum to K.
	Subsets are of length varying from 0 to n, that contain elements of the array. 
	But the order of elements should remain same as in the input array.
	
	Note : The order of subsets are not important.
	
	Input format :
	Line 1 : Integer n, Size of input array
	Line 2 : Array elements separated by space
	Line 3 : K 
	
	Constraints :
	1 <= n <= 20
	
	Sample Input :
	9 
	5 12 3 17 1 18 15 3 17 
	6
	
	Sample Output :
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
		int output[][] = solution.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}

************/

public class ReturnSubsetsSumToK {

	public static int[][] subsetsSumK(int input[], int k) {
        return subsets(input, k, 0);
	}
    
    public static int[][] subsets(int[] arr, int k, int startIndex) {

		if(startIndex == arr.length) {
			if(k == 0) {
				int[][] empty = new int[1][0];
				return empty;
			}
			int[][] empty = new int[0][0];
			return empty;
		}

		int[][] smallAns1 = subsets(arr, k, startIndex + 1);
		int[][] smallAns2 = subsets(arr, k - arr[startIndex], startIndex + 1);
		int[][] res = new int[smallAns1.length + smallAns2.length][];
		
		int i = 0;
		for( ; i < smallAns2.length; i++) {
			res[i] = new int[smallAns2[i].length + 1];
			res[i][0] = arr[startIndex];
			for(int j = 0; j < smallAns2[i].length; j++) {
				res[i][j + 1] = smallAns2[i][j];
			}
		}
		int x = 0;
		for( ; i < res.length; i++, x++) {
			res[i] = new int[smallAns1[x].length];
			for(int j = 0; j < smallAns1[x].length; j++) {
				res[i][j] = smallAns1[x][j];
			}
		}
		return res;
	}
    
}