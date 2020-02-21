package Recursion2;

/* **********

	Print Permutations of a String
	
	Given a string, find and print all the possible permutations of the input string.
	
	Note : The order of permutations are not important. Just print them in different lines.
	
	Sample Input :
	abc
	
	Sample Output :
	abc
	acb
	bac
	bca
	cab
	cba

************/

/* **********

import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		solution.permutations(input);
	}
}

************/

public class PrintPermutationsOfAString {
    
    public static void printAllPermutations(String str, String outputSoFar) {

		if(str.length() == 0) {
			System.out.println(outputSoFar);
			//return;			
		}

		for(int i = 0; i < str.length(); i++) {
			String toBePermuted = str.substring(0, i) + str.substring(i + 1);
			printAllPermutations(toBePermuted, outputSoFar + str.charAt(i));
		}
		
	}

	public static void permutations(String input){
		
        printAllPermutations(input, "");

	}
}
