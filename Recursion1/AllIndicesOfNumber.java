package Recursion1;

/* **********

	All Indices of Number

	Given an array of length N and an integer x, you need to find all the indexes where x is present 
	in the input array. Save all the indexes in an array (in increasing order).
	Do this recursively. Indexing in the array starts from 0.

	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x

	Output Format :
	indexes where x is present in the array (separated by space)

	Constraints :
	1 <= N <= 10^3

	Sample Input :
	5
	9 8 10 8 8
	8

	Sample Output :
	1 3 4

 ************/

/* **********

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}

 ************/

public class AllIndicesOfNumber {

	public static int[] allIndexes(int input[], int x) {

		int[] arr = allIndex(input, x, 0);
		return arr;
	}

	public static int[] allIndex(int[] arr, int x, int startIndex) {

		if(arr.length == startIndex) {
			int[] array = new int[0];
			return array;
		}

		int[] smallAns = allIndex(arr, x, startIndex + 1);

		if(arr[startIndex] == x) {
			int ans[] = new int[smallAns.length + 1];
			ans[0] = startIndex;
			for(int i = 0; i < smallAns.length; i++) {
				ans[i + 1] = smallAns[i];
			}
			return ans;
		}
		else {
			return smallAns;
		}
	}

}
