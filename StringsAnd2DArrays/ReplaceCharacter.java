package StringsAnd2DArrays;

/* **********

	Replace character
	
	Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
	Input Format :
	Line 1 : Input String S
	Line 2 : Character c1 and c2 (separated by space)
	Output Format :
	Updated string
	Constraints :
	1 <= Length of String S <= 10^6
	Sample Input :
	abacd
	a x
	Sample Output :
	xbxcd

************/

/* **********

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(Solution.replaceCharacter(input, c1, c2));
	}
}


************/

public class ReplaceCharacter {

	public static String replaceCharacter(String str, char c1, char c2) {
		
      String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c1) {
				str1 += c2;
			}
			else {
				str1 += str.charAt(i);
			}
		}
      
		return str1;

	}
}
