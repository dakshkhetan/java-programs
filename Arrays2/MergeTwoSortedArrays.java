package Arrays2;

/* **********

	Merge Two Sorted Arrays
	
	Given two sorted arrays of Size M and N respectively, merge them into a third array such that the third array is also sorted.
	Input Format :
	 Line 1 : Size of first array i.e. M
	 Line 2 : M elements of first array separated by space
	 Line 3 : Size of second array i.e. N
	 Line 2 : N elements of second array separated by space
	Output Format :
	M + N integers i.e. elements of third sorted array separated by spaces.
	Constraints :
	1 <= M, N <= 10^6
	Sample Input :
	5
	1 3 4 7 11
	4
	2 4 6 13
	Sample Output :
	1 2 3 4 4 6 7 11 13 

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
		
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int ans[] = Solution.merge(arr1, arr2);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

}

************/

public class MergeTwoSortedArrays {

	public static int[] merge(int arr1[], int arr2[]){
		
		int n = arr1.length + arr2.length;
		int arr3[] = new int[n];
		int i, j, k;
		i = j = k = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			}
			else {
				arr3[k++] = arr2[j++];
			}
		}
		while(i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while(j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		return arr3;

	}
	
}
