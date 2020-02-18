package Recursion2;

/* **********

	Return subsequences of String
	
	Given a string (lets say of length n), return all the subsequences of the given string.
	Subsequences contain all the strings of length varying from 0 to n. 
	But the order of characters should remain same as in the input string.
	
	Note : The order of subsequences are not important.
	
	Sample Input:
	abc
	
	Sample Output:
	"" (the double quotes just signifies an empty string, don't worry about the quotes)
	c 
	b 
	bc 
	a 
	ac 
	ab 
	abc 

************/

/* **********

import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = solution.subsequence(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}

************/

public class ReturnSubsequencesOfString {

	public static String[] subsequence(String str){
		
        if(str.length() == 0) {
			String[] baseCaseArray = {""};
			return baseCaseArray;
		}
		
		String[] rosSubsequences = subsequence(str.substring(1));
		String[] totalSubsequences = new String[2 * rosSubsequences.length];
		
		int i = 0;			//i must be accessible throughout the function
		for( ; i < rosSubsequences.length; i++) {
			totalSubsequences[i] = rosSubsequences[i];
		}
		
		int j = 0;
		for( ; i < totalSubsequences.length; i++, j++) {
			totalSubsequences[i] = str.charAt(0) + rosSubsequences[j];
		}
		return totalSubsequences;

	}
}