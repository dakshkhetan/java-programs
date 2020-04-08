package StringsAnd2DArrays;

/* **********

	Find Largest Row or Column
	
	Given an NxM 2D array, you need to find out which row or column has largest sum (sum of its elements) overall amongst all rows and columns.
	Input Format :
	 Line 1 : 2 integers N and M respectively, separated by space 
	 Line 2: Single line having N*M elements entered in row wise manner, each separated by space.
	Output Format :
	 If row sum is maximum then - "row" row_num max_sum
	 If column sum is maximum then - "column" col_num max_sum
	Note : If there are more than one rows/columns with maximum sum consider the row/column that comes first. And if ith row and jth column has same sum (which is largest), consider the ith row as answer.
	Sample Input 1 :
	2 2 
	1 1 1 1
	Sample Output 1 :
	row 0 2
	Sample Input 2 :
	3 3
	3 6 9 1 4 7 2 8 9
	Sample Output 2 :
	column 2 25

************/

/* **********

import java.util.Scanner;

public class Runner {
	
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
		Solution.findLargest(input);
		
	}

}

************/

public class FindLargestRowOrColumn {

	public static void findLargest(int arr[][]){
		
		int sumr, maxRowSum = Integer.MIN_VALUE, maxRowIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			sumr = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sumr+=arr[i][j];
			}
			if(sumr > maxRowSum) {
				maxRowSum = sumr;
				maxRowIndex = i;
			}
		}
		
		int sumc, maxColSum = Integer.MIN_VALUE, maxColIndex = -1;
		for(int j = 0; j < arr[0].length; j++) {
			sumc = 0;
			for(int i = 0; i < arr.length; i++) {
				sumc += arr[i][j];
			}
			if(sumc > maxColSum) {
				maxColSum = sumc;
				maxColIndex = j;
			}
		}
		
		if(maxRowSum >= maxColSum) {
			System.out.println("row " + maxRowIndex + " " + maxRowSum);
		}
		else {
			System.out.println("column " + maxColIndex + " " + maxColSum);
		}

	}
	
}