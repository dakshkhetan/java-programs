package StringsAnd2DArrays;

/* **********

	Remove Consecutive Duplicates
	
	Given a string, remove all the consecutive duplicates that are present in the given string. That means, if 'aaa' is present in the string then it should become 'a' in the output string.
	
	Sample Input:
	aabccbaa
	
	Sample Output:
	abcba

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(solution.removeConsecutiveDuplicates(input));
	}
}

************/

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
	    
     	String str1 = "";
		str1 += str.charAt(0);
		char c = str.charAt(0);

		for (int i = 1; i < str.length(); i++) { 
			if(str.charAt(i) != c) {	//comparing with last added character
				str1 += str.charAt(i);
				c = str.charAt(i);		//updating the last added character
			}
		} 

		return str1;

	}
}