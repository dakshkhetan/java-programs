package StringsAnd2DArrays;

/* **********

	Minimum Length Word
	
	Given a string S (that can contain multiple words), you need to find the word which has minimum length.
	Note : If multiple words are of same length, then answer will be first minimum length word in the string.
	Words are seperated by single space only.
	Input Format :
	String S
	Output Format :
	Minimum length word
	Constraints :
	1 <= Length of String S <= 10^5
	Sample Input 1 :
	this is test string
	Sample Output 1 :
	is
	Sample Input 2 :
	abc de ghihjk a uvw h j
	Sample Output 2 :
	a

************/

/* **********

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(Solution.minLengthWord(str));
	}

}

************/

public class MinimumLengthWord {
	
	public static String minLengthWord(String str){
		
		String minWord = "abcdefghij";
		int beginIndex = 0;
		for(int i = 0; i < str.length(); i++) {
			String countWord = "";
			if(str.charAt(i) == ' ') {
				for(int j = beginIndex; j < i; j++) {
					countWord += str.charAt(j);
				}
				if(minWord.length() > countWord.length()) {
					minWord = countWord;
				}
				beginIndex = i + 1;
			}
		}
		return minWord;

	}
}
