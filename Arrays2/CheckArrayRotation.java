package Arrays2;

/* **********

	Check array rotation
	
	Given an integer array, which is sorted (in increasing order) and has been rotated by some number k in clockwise direction. Find and return the k.
	Input format :
	Line 1 : Integer n (Array Size)
	Line 2 : Array elements (separated by space)
	Output Format :
	Integer k
	Constraints :
	1 <= n <= 1000
	Sample Input 1:
	6
	5 6 1 2 3 4
	Sample Output 1:
	2
	Sample Input 2:
	5
	3 6 8 9 10
	Sample Output 2:
	0

************/

/* **********

import java.util.Scanner;

public class Main {
	
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
		int[] arr = takeInput();
		System.out.print(CheckRotation.arrayRotateCheck(arr));
	}
}

************/

public class CheckArrayRotation {	

	public static int arrayRotateCheck(int[] arr){

      	int i, min = arr[0], j = 0;
		for(i=0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				j = i;
			}
		}
      	return j;
	}
}
