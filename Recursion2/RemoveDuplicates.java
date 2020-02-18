package Recursion2;

/* **********

	Remove Duplicates
	
	Given a string S, remove consecutive duplicates from it recursively.
	
	Input Format :
	String S
	
	Output Format :
	Output string
	
	Constraints :
	1 <= Length of String S <= 10^3
	
	Sample Input :
	aabccba
	
	Sample Output :
	abcba

************/

/* **********

import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}

************/

public class RemoveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		
        if(str.length() == 1) {
			return str.substring(0);
		}

		if(str.length() < 2) {
			return "";
		}

		String currentCharacter = str.substring(0, 1);

		if(str.substring(1, 2).equals(currentCharacter)) {
			return removeConsecutiveDuplicates(str.substring(1)); 
		}
		else {
			return currentCharacter + removeConsecutiveDuplicates(str.substring(1));
		}

	}

}
