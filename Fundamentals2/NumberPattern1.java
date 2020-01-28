package Fundamentals2;

/* **********

	Number Pattern 1
	
	Print the following pattern for the given N number of rows.
	Pattern for N = 4
	1
	11
	111
	1111
	
	Input format :
	Integer N (Total no. of rows)
	
	Output format :
	Pattern in N lines
	
	Sample Input :
	5
	
	Sample Output :
	1
	11
	111
	1111
	11111

************/

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {				//*
		Scanner s = new Scanner(System.in);					//**
		int n = s.nextInt();								//***
		int row = 1;										//****
		while (row<=n) {
			int count = 1;
			while (count <= row) {
				System.out.print("1");
				count++;			
			}
			System.out.println();
			row++;
		}
	}
}
