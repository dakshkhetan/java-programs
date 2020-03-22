package Arrays1;

/* **********

	Swap Alternate
	
	Given an array of length N, swap every pair of alternate elements in the array.
	You don't need to print or return anything, just change in the input array itself.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Output Format :
	Elements after swapping, separated by space.
	Sample Input 1:
	6
	9 3 6 12 4 32
	Sample Output 2 :
	3 9 12 6 32 4
	Sample Input 1:
	9
	9 3 6 12 4 32 5 11 19
	Sample Output 2 :
	3 9 12 6 32 4 11 5 19

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
		Solution.swapAlternate(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}
		
	}

}

************/


public class SwapAlternate {

	
	public static void swapAlternate(int[] arr){	
      
		int i, x, m;
		int n = arr.length;
		if(n%2==0) {
			m = n;
		}
		else {
			m = n - 1;
		}
		for(i=0; i<m; i+=2) {
			x = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = x;
		}
	}
	
}
