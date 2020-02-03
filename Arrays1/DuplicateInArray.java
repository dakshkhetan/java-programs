package Arrays1;

/* **********

	Duplicate in array
	
	Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. You need to find and return that duplicate number present in the array.
	Assume, duplicate number is always present in the array.
	
	Input format :
	Line 1 : Size of input array
	Line 2 : Array elements (separated by space)
	
	Output Format :
	Duplicate element
	
	Constraints :
	1 <= n <= 10^6
	
	Sample Input:
	9
	0 7 2 5 4 7 1 3 6
	
	Sample Output:
	7

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
		System.out.print(DuplicateInArray.duplicate(arr));
	}
}

************/

public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
      
      	int sum, sum_arr = 0, n = arr.length;
      	sum = (n-2)*(n-1)/2;    	//finding sum of n-2 natural numbers
      
      	for(int i=0;i<arr.length;i++){		//finding sum of all array elements
			sum_arr+=arr[i];
        }
      
      return sum_arr - sum;			//their difference gives the duplicate element

	}
}
