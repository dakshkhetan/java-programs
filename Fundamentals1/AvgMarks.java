package Fundamentals;

/* **********

	Average Marks
	
	Write a program to input name (as a single character) and marks of three tests of a student (all integers). 
	Then calculate and print the name and average (integer) of all test marks.
	All the test marks are integers and calculate average also as integer. 
	That is, you need to print the integer part of average only, neglect the decimal part.
	
	Input format :
	Line 1 : Name (Single character)
	Line 2 : 3 Test marks (separated by space)
	
	Output format :
	Name Average (in different lines)
	
	Sample Input 1 :
	A
	3 4 6
	
	Sample Output 1 :
	A
	4

************/

import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Please enter name and marks:");
		char name = s.nextLine().charAt(0);
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		
		int avg = (m1 + m2 + m3) / 3;
		System.out.println(name);
		System.out.println(avg);
	}

}
