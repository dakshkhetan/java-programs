package Recursion2;

/* **********

	Return Permutations of a String
	
	Given a string, find and return all the possible permutations of the input string.
	
	Note : The order of permutations are not important.
	
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
		String output[] = solution.permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}

************/

public class ReturnPermutationsOfAString {
	
	public static String[] permutationOfString(String str){
		
        if(str.length() == 0) {
			String[] baseCaseArray = new String[1];
			baseCaseArray[0] = "";
			return baseCaseArray;
		}

		String[] rosPermutations = permutationOfString(str.substring(1));
		String[] totalPermutations = new String[str.length() * rosPermutations.length];
		int k = 0;
		for(String permutation : rosPermutations) {
			for(int i = 0; i <= permutation.length(); i++) {
				totalPermutations[k++] = permutation.substring(0, i) + str.charAt(0) 
											+ permutation.substring(i);
			}
		}
		return totalPermutations;
		
	}
	
}
