package StringsAnd2DArrays;

/* **********

	String Palindrome
	
	Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
	Palindrome strings are those, where string s and its reverse is exactly same.
	Input Format :
	 String S
	Output Format :
	"true" if S is palindrome, else "false"
	Sample Input 1 :
	abcdcba
	Sample Output 1 :
	true 

************/

/* **********

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(Solution.checkPalindrome(str));
	}

}

************/


public class StringPalindrome {

	public static boolean checkPalindrome(String str){
		
      	int i, j, flag = 0;
		for(i = 0, j = str.length() - 1; i < j; i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			return true;
		}
		else {
			return false;
		}

	}
}
