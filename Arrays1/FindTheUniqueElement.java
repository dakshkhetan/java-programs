package Arrays1;

/* **********

	Find the Unique Element
	
	Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
	You need to find and return that number which is unique in the array.
	Note : Given array will always contain odd number of elements.
	Input format :
	Line 1 : Array size i.e. 2N+1
	Line 2 : Array elements (separated by space)
	Output Format :
	Unique element present in the array
	Constraints :
	1 <= N <= 10^6
	Sample Input :
	7
	2 3 1 6 3 6 2
	Sample Output :
	1

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
		System.out.print(FindUnique.findUnique(arr));
	}
}

************/

public class FindTheUniqueElement{	

	public static int findUnique(int[] arr){
		
      int i, j;
      for(i=0;i<arr.length;i++){
        for(j=0;j<arr.length;j++){
			if(i!=j&&arr[i]==arr[j]){
				break;
            }        
        }
        if(j==arr.length){
         return arr[i];
        }
      }
		return -1;       
      //return Integer.MAX_VALUE;         
	}
}
