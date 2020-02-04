package Arrays2;

/* **********

	Sum of two arrays
	
	Two random integer arrays are given A1 and A2, in which numbers from 0 to 9 are present at every index (i.e. single digit integer is present at every index of both given arrays).
	You need to find sum of both the input arrays (like we add two integers) and put the result in another array i.e. output array (output arrays should also contain only single digits at every index).
	The size A1 & A2 can be different.
	Note : Output array size should be 1 more than the size of bigger array and place 0 at the 0th index if there is no carry. No need to print the elements of output array.
	Input format :
	Line 1 : Integer n1 (A1 Size)
	Line 2 : A1 elements (separated by space)
	Line 3 : Integer n2 (A2 Size)
	Line 4 : A2 elements (separated by space)
	Output Format :
	Output array elements (separated by space)
	Constraints :
	1 <= n1, n2 <= 10^6
	Sample Input 1:
	3
	6 2 4
	3
	7 5 6
	Sample Output 1:
	1 3 8 0
	Sample Input 2:
	3
	8 5 2
	2
	1 3
	Sample Output 2:
	0 8 6 5


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
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(SumOfTwoArrays.sumOfTwoArrays(arr1, arr2));
	}
}

************/

public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		
      	int n1 = arr1.length;
      	int n2 = arr2.length;
      	int n3;
		if(n1>n2) {
			n3 = n1+1;
		}
		else {
			n3 = n2+1;
		}
		int[] arr3 = new int[n3];
		int i, j, k=n3-1, num, carry = 0;
		for(i = n1-1,j = n2-1; i>=0 && j>=0; i--,j--) {
			num = arr1[i] + arr2[j] + carry;
			arr3[k--] = num % 10;
			carry = num/10;
		}
		if(i>j) {
			while(i>=0) {
				num = arr1[i--] + carry;
				arr3[k--] = num % 10;
				carry = num/10;
			}
			
		}
		else if(i<j){
			while(j>=0) {
				num = arr2[j--] + carry;
				arr3[k--] = num % 10;
				carry = num/10;
			}
		}
		else {
			arr3[0]+=carry;
		}
      return arr3;

	}
}
