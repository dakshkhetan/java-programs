package Arrays2;

/* **********

	Binary Search
	
	Given a sorted integer array (in ascending order) and an element x. You need to search this element x in the given input array using binary search. Return the index of element in the input.
	Indexing starts from 0.
	Return -1 if x is not present in the input array.
	Input format :
	Line 1 : Integer N, Array Size
	Line 2 : Array elements (separated by space)
	Line 3 : Element to be searched (i.e. x)
	Output Format :
	Index
	Constraints :
	1 <= N <= 10^6
	Sample Input 1:
	7
	1 3 7 9 11 12 45
	3
	Sample Output 1:
	1
	Sample Input 2:
	7
	1 2 3 4 5 6 7
	9
	Sample Output 2:
	-1

************/

/* **********

import java.util.Scanner;

public class Main {
	static Scanner s1 = new Scanner(System.in);
		
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(BinarySearch.binarySearch(arr, num));
	}
}

************/

public class BinarySearch{	
	
	//arr is the given sorted array in which you need to find num
	
  	public static int binarySearch(int[] arr, int element){
		int l = 0, r = arr.length - 1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(element == arr[mid]) {
				return mid;
			}
			else if(element < arr[mid]) {
				r = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		return -1;
	}
}
