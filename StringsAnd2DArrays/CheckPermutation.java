package StringsAnd2DArrays;

/* **********

	Check Permutation
	
	Given two strings, check if they are permutations of each other. Return true or false.
	Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
	Note : Input strings contain only lowercase english alphabets.
	Input format :
	Line 1 : String 1
	Line 2 : String 2
	Sample Input 1 :
	abcde
	baedc
	Sample Output 1 :
	true
	Sample Input 2 :
	abc
	cbd
	Sample Output 2 :
	false

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(solution.isPermutation(input1, input2));
	}
}

************/

public class CheckPermutation {

	public static boolean isPermutation(String str1, String str2) {
	    
      	if(str1.length() != str2.length()) {
			return false;
		}

		int count[] = new int[256];		//for storing alphabets from a(97) to z(256)

		//refer hint video for explanation
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++; 
		}

		for (int i = 0; i < str2.length(); i++) {
			count[str2.charAt(i)]--; 
		}

		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
