package BetterSolutions;

/* **********

	Palindrome Substrings
	
	Given a string S, count and return the number of substrings of S that are palindrome.
	Single length substrings are also palindromes. You just need to calculate the count, 
	not the substrings.
	
	Input Format :
	String S
	
	Output Format :
	count of palindrome substrings
	
	Constraints :
	1 <= Length of S <= 1000
	
	Sample Input :
	aba
	
	Sample Output :
	4
	
	Note : Here 4 corresponds to ("a","b","a","aba").

************/

/* **********

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int count = PalindromeSubstrings.countPalindromeSubstrings(input);
		System.out.println(count);
	}
}

************/

public class PalindromeSubstrings {

	public static int countPalindromeSubstrings(String s) {
		
        int n = s.length();
        int ans = 0;
        for (int center = 0; center <= 2*n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            int right = left + center % 2;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
	}
    
}
