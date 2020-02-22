package Recursion2;

/* **********

	Return all codes
	
	Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. 
	Write a program to return the list of all possible codes that can be generated from the given string.
	
	Note : The order of codes are not important.
	
	Input format :
	A numeric string
	
	Sample Input:
	1123
	
	Sample Output:
	aabc
	kbc
	alc
	aaw
	kw

************/

/* **********

import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = solution.getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}

************/

public class ReturnAllCodes {
    
    public static String code(int c) {
		if(c == 1)
			return "a";
		else if(c == 2)
			return "b";
		else if(c == 3)
			return "c";
		else if(c == 4)
			return "d";
		else if(c == 5)
			return "e";
		else if(c == 6)
			return "f";
		else if(c == 7)
			return "g";
		else if(c == 8)
			return "h";
		else if(c == 9)
			return "i";
		else if(c == 10)
			return "j";
		else if(c == 11)
			return "k";
		else if(c == 12)
			return "l";
		else if(c == 13)
			return "m";
		else if(c == 14)
			return "n";
		else if(c == 15)
			return "o";
		else if(c == 16)
			return "p";
		else if(c == 17)
			return "q";
		else if(c == 18)
			return "r";
		else if(c == 19)
			return "s";
		else if(c == 20)
			return "t";
		else if(c == 21)
			return "u";
		else if(c == 22)
			return "v";
		else if(c == 23)
			return "w";
		else if(c == 24)
			return "x";
		else if(c == 25)
			return "y";
		else if(c == 26)
			return "z";
		else
			return "";
	}

	public static  String[] getCode(String str){
		
        if(str.length() == 0) {
			String[] empty = {""};
			return empty;
		}
        
		String [] withoutfirst = getCode(str.substring(1));
		String [] res1 = new String[withoutfirst.length];
		for(int i = 0; i < res1.length; i++) {
			res1[i] = code(str.charAt(0) - 48) + withoutfirst[i];
		}
		if(str.length() >= 2) {
			int comb = (str.charAt(0) - 48) * 10 + (str.charAt(1) - 48);
			if(comb <= 26) {
				String[] combination = getCode(str.substring(2));
				String[] res2 = new String[combination.length];
				for(int i = 0; i < res2.length; i++) {
					res2[i] = code(comb) + combination[i];
				}
				String[] res = new String[res1.length + res2.length];
				int i = 0;
				for( ; i < res1.length; i++) {
					res[i] = res1[i];
				}
				int k = 0;
				for( ; i < res.length; i++, k++) {
					res[i] = res2[k];
				}
				return res;
			}
		}
		return res1; 
		
	}

}