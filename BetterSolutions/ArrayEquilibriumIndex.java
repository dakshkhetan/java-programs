package BetterSolutions;

/* **********

	Array Equilibrium Index
	
	Find and return the equilibrium index of an array. Equilibrium index of an array is an 
	index i such that the sum of elements at indices less than i is equal to the sum of elements 
	at indices greater than i.
	Element at index i is not included in either part.
	If more than one equilibrium index is present, you need to return the first one. 
	And return -1 if no equilibrium index is present.
	
	Input format :
	Line 1 : Size of input array
	Line 2 : Array elements (separated by space)
	
	Constraints:
	Time Limit: 1 second
	Size of input array lies in the range: [1, 1000000]
	
	Sample Input :
	7
	-7 1 5 2 -4 3 0
	
	Sample Output :
	3 

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
		System.out.print(ArrayEquilibrium.arrayEquilibrium(arr));
	}
}

************/

public class ArrayEquilibriumIndex{	
	
	public static int arrayEquilibrium(int[] arr) {  

        int n = arr.length;
        int n = arr.length;
        int sum = 0;
        int leftsum = 0;
  
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i]; // sum is now right sum for index i 
  
            if (leftsum == sum) 
                return i; 
  
            leftsum += arr[i]; 
        } 
  
        /* If no equilibrium index found, then return 0 */
        return -1; 
    } 

}