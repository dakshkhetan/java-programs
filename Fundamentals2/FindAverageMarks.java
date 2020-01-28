package Fundamentals2;

/* **********

	Find average Marks
	
	Write a program to input name (as a single character) and marks of three tests of a student (all integers). Then calculate and print the name and average (integer) of best two test marks.
	All the test marks are integers and calculate average also as integer. That is, you need to print the integer part of average only, neglect the decimal part.
	
	Input format :
	Line 1 : Name (Single character)
	Line 2 : 3 Test marks (separated by space)
	
	Output format :
	Name Average (separated by space)
	
	Sample Input 1 :
	a
	345 123 10
	
	Sample Output 1 :
	a 234
	
	Sample Input 2 :
	b
	23 12 44
	
	Sample Output 2 :
	b 33

************/

import java.util.Scanner;

public class FindAverageMarks {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char a = s.nextLine().charAt(0);
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int max1, max2;
		max1 = max2 = m1;
		if(m2 > max1) {
			max1 = m2;
			if(m3>max1) {
				max1 = m3;
				max2 = m2;
			}
			else if(m1<m3) {
				max2 = m3;
			}
		}
		else if(m3>max1) {
			max1 = m3;
		}
		else if(m2>m3) {
			max2 = m2;
		}
		else {
			max2 = m3;
		}
		int avg = (max1+max2)/2;
		System.out.println(a + " " + avg);

	}

}