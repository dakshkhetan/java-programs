package Arrays2;

/* **********

	Sort 0 1 2
	
	You are given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only.
	You need to change in the given array itself. So no need to return or print anything.
	Input format :
	Line 1 : Integer n (Array Size)
	Line 2 : Array elements (separated by space)
	Output Format :
	Updated array elements (separated by space)
	Constraints :
	1 <= n <= 10^6
	Sample Input:
	7
	0 1 2 0 2 0 1
	Sample Output:
	0 0 0 1 1 2 2 

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

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		Sort012.sort012(arr);
		print(arr);
	}
}

************/

public class Sort012{	

	public static void sort012(int[] arr){
		
      	int n = arr.length;
      	int[] temp = new int[n];
		int i, nz = 0, nt = n-1;
		for(i=0; i<n; i++) {
			if(arr[i]==0) {
				temp[nz++] = arr[i];
			}
			else if(arr[i]==2) {
				temp[nt--] = arr[i];
			}
			
		}
		
		for(i=nz;i<=nt;i++) {
			temp[i]=1;
		}
		
		for(i=0; i < n; i++) {
			arr[i]=temp[i];
		}

	}
}
