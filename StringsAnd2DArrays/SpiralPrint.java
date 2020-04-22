package StringsAnd2DArrays;

/* **********
	
	Spiral Print
	
	Given an N*M 2D array, print it in spiral form. That is, first you need to print the 1st row, then last column, then last row and then first column and so on.
	Print every element only once.
	Input format :
	Line 1 : N and M, No. of rows & No. of columns (separated by space) followed by N*M  elements in row wise fashion.
	Sample Input :
	 4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
	Sample Output :
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

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
		int a[][] = takeInput2D();
		solution.spiralPrint(a);
	}
}

************/

public class SpiralPrint {

	public static void spiralPrint(int arr[][]){
		
      	int rowStart = 0, rowEnd = arr.length - 1;
		int colStart = 0, colEnd = arr[0].length - 1;
		int count = 1;
		int n = arr.length * arr[0].length;
		int n = arr.length * arr[0].length;
		while(count <= n) {
			for(int j = colStart; count <= n && j <= colEnd; j++) {
				System.out.print(arr[rowStart][j] + " ");
				count++;
			}
			rowStart++;
			for(int i = rowStart; count <= n && i <= rowEnd; i++) {
				System.out.print(arr[i][colEnd] + " ");
				count++;
			}
			colEnd--;
			for(int j = colEnd; count <= n && j >= colStart; j--) {
				System.out.print(arr[rowEnd][j] + " ");
				count++;
			}
			rowEnd--;
			for(int i = rowEnd; count <= n && i >= rowStart; i--) {
				System.out.print(arr[i][colStart] + " ");
				count++;
			}
			colStart++;
		}
      
	}
}
