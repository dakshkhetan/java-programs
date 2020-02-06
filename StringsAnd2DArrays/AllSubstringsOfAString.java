package StringsAnd2DArrays;

/* **********

	All Substrings of a String
	
	Given a String S of length n, print all its substrings.
	Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.
	Input Format :
	String S
	Output Format :
	 All Substrings of S, one in each line.
	Note : The order in which you print substrings doesn't matter.
	Sample Input 1 :
	xyz
	Sample Output 1 :
	x
	xy
	xyz
	y
	yz
	z

************/

/* **********

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Solution.printSubstrings(str);
	}

}

************/

public class AllSubstringsOfAString {

	public static void printSubstrings(String str){
	
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length() + 1; j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}
	
}
