package Arrays2;

/* **********

	Second Largest in array
	
	Given a random integer array of size n, find and return the second largest element present in the array.
	If n <= 1 or all elements are same in the array, return -2147483648 i.e. -2^31.
	Input format :
	Line 1 : Integer n (Array Size)
	Line 2 : Array elements (separated by space)
	
	Output Format :
	Second largest element
	
	Constraints :
	1 <= N <= 10^6
	
	Sample Input 1:
	7
	2 13 4 1 3 6 28
	
	Sample Output 1:
	13
	
	Sample Input 2:
	5
	9 3 6 2 9
	
	Sample Output 2:
	6
	
	Sample Input 3:
	2
	6 6
	
	Sample Output 3:
	-2147483648

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
		System.out.print(SecondLargest.secondLargestElement(arr));
	}
}

************/

public class SecondLargestInArray{	
	
	public static int secondLargestElement(int[] arr) {
		
      	int i, n=arr.length;
		int max1 = arr[0], max2 = arr[0];
		for(i=1;i<n;i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
			}
		}
		for(i=0;i<n;i++) {
			if(arr[i]<max1&&arr[i]>max2) {
				max2 = arr[i];
			}
		}
      return max2;

	}
}