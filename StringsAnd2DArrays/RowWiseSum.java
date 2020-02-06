package StringsAnd2DArrays;

/* **********

	Row Wise Sum
	
	Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.
	Input Format :
	Line 1 : Two integers M and N (separated by space) 
	Line 2 : Matrix elements of each row (separated by space)
	Output Format :
	Sum of every ith row elements (separated by space)
	Constraints :
	1 <= M, N <= 10^3
	Sample Input :
	4 2 
	1 2 3 4 5 6 7 8
	Sample Output :
	3 7 11 15 

************/

import java.util.Scanner;

public class RowWiseSum {

	public static Scanner s = new Scanner(System.in);

	public static void printRowSum(int[][] arr){
		for(int i = 0; i < arr.length; i++) {
			int sumr = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sumr+=arr[i][j];
			}
			System.out.print(sumr + " ");
		}
	}

	public static int[][] takeInput() {
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = takeInput();
		printRowSum(arr);
	}

}
