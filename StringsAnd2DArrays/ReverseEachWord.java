package StringsAnd2DArrays;

/* **********

	Reverse Each Word
	
	Given a string S, reverse each word of a string individually. For eg. if a string is "abc def", reversed string should be "cba fed".
	Input Format :
	String S
	Output Format :
	Updated string
	Constraints :
	1 <= Length of S <= 1000
	Sample Input :
	Welcome to Coding Ninjas
	Sample Output:
	emocleW ot gnidoC sajniN

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseEachWord(input));
	}
}

************/

public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		
      	String revStr = "";
		String revWord = "";
		int beginIndex = 0;
		for(int i = 0; i < str.length(); i++) {
			revWord = "";
			if(str.charAt(i) == ' ') {
				for(int j = i-1; j >= beginIndex; j--) {
					revWord += str.charAt(j);
				}
				revStr = revStr + revWord + " ";
				beginIndex = i + 1;
			}
		}
		for(int i = str.length() - 1; i >= beginIndex; i--) {
			revWord = revWord + str.charAt(i);
		}
		revStr = revStr + revWord;
		return revStr;

	}
}
