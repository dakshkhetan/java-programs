package Arrays1;

/* **********

	Triplet sum
	
	Given a random integer array and a number x. Find and print the triplets of elements in the array which sum to x.
	While printing a triplet, print the smallest element first.
	That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
	Input format :
	Line 1 : Integer N (Array Size)
	Line 2 : Array elements (separated by space)
	Line 3 : Integer x
	Output format :
	Line 1 : Triplet 1 elements (separated by space)
	Line 2 : Triplet 3 elements (separated by space)
	Line 3 : and so on
	Constraints :
	1 <= N <= 1000
	1 <= x <= 100
	Sample Input:
	7
	1 2 3 4 5 6 7 
	12
	Sample Output ;
	1 4 7
	1 5 6
	2 3 7
	2 4 6
	3 4 5

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
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		TripletSum.FindTriplet(arr, num);
	}
}

************/

public class TripletSum {	

	public static void FindTriplet(int[] arr, int sum){
		
      	//first we need to sort the array
		int n = arr.length;
		for(int round = 1; round < n; round++) {
			for(int i=0; i<n-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
      
      	//now we need to find and print the triplets
		for (int i = 0; i < n - 2; i++) { 
			for (int j = i + 1; j < n - 1; j++) { 
				for (int k = j + 1; k < n; k++) { 
					if (arr[i] + arr[j] + arr[k] == sum) { 
						System.out.println(arr[i]+ " " + arr[j] + " " + arr[k]); 
					} 
				} 
			} 
		}
	}
}
}
