package BetterSolutions;

/* **********

	Quick Sort
	
	Sort an array A using Quick Sort.
	Change in the input array itself. So no need to return or print anything.
	
	Input format :
	Line 1 : Integer n i.e. Array size
	Line 2 : Array elements (separated by space)
	
	Output format :
	Array elements in increasing order (separated by space)
	
	Constraints :
	1 <= n <= 1000
	
	Sample Input:
	6 
	2 6 8 5 4 3
	
	Sample Output:
	2 3 4 5 6 8

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
		Solution.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}

************/

public class QuickSort {
    
    public static void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		int partitionIndex = partition(arr, start, end);
		quickSort(arr, start, partitionIndex - 1);
		quickSort(arr, partitionIndex + 1, end);
		
	}
	
	public static int partition(int[] arr, int start, int end) {
		
		int pivotElement = arr[start];
		int count = 0;
		
		for(int i = start; i <= end; i++) {
			if(arr[i] < pivotElement)
				count++;
		}
		
		int pivotPosition = start + count;
		
		//swap elements at start and pivotPosition
		int temp = arr[start];			
		arr[start] = arr[pivotPosition];
		arr[pivotPosition] = temp;
		
		int i = start, j = end;
		while(i < pivotPosition && j > pivotPosition) {
			if(arr[i] < pivotElement) {
				i++;
			}
			else if(arr[j] >= pivotElement) {
				j--;
			}
			else {
				int tempVar = arr[i];
				arr[i] = arr[j];
				arr[j] = tempVar;
				i++;
				j--;
			}
		}
		return pivotPosition; 
	}
	
	public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
	}
	
}