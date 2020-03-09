package StringsAnd2DArrays;

/* **********

	Wave Print
	
	Given a two dimensional n*m array, print the array in a sine wave order. i.e. print the first column top to bottom, next column bottom to top and so on.
	Note : Print the elements separated by space.
	Input format :
	n, m, array elements (separated by space)
	Sample Input :
	3 4 1  2  3  4 5  6  7  8 9 10 11 12
	Sample Output :
	1 5 9 10 6 2 3 7 11 12 8 4

************/

/* **********

import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
	
		int input[][] = takeInput2D();
		Solution.wavePrint(input);
		
	}

}

************/

public class WavePrint {

	// input - input 2D array
	public static void wavePrint(int arr[][]){
		
		for(int j = 0; j < arr[0].length; j++) {
			if(j%2 == 0) {
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for(int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
  
}