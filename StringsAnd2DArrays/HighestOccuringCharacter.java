package StringsAnd2DArrays;

/* **********

	Highest Occuring Character
	
	Given a string, find and return the highest occurring character present in the given string.
	If there are 2 characters in the input string with same frequency, return the character which comes first.
	Note : Assume all the characters in the given string are lowercase.
	
	Sample Input 1:
	abdefgbabfba
	
	Sample Output 1:
	b
	
	Sample Input 2:
	xy
	
	Sample Output 2:
	x

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.highestOccuringCharacter(input));
	}
}

************/

public class HighestOccuringCharacter {

	public static char highestOccuringCharacter(String str) {
		
      	int count[] = new int[256];		//for storing alphabets from a(97) to z(256)
		int max = -1;
		char ans = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++; 
		}

		for (int i = 0; i < str.length(); i++) { 
			if (max < count[str.charAt(i)]) { 
				max = count[str.charAt(i)]; 
				ans = str.charAt(i); 
			} 
		} 

		return ans;

	}
}