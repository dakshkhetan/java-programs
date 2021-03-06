package Recursion2;

/* **********

	Print Keypad
	
	Given an integer n, using phone keypad find out and print all the possible strings 
	that can be made using digits of input n.
	Note : The order of strings are not important. Just print different strings in new lines.
	
	Input Format :
	Integer n
	
	Output Format :
	All possible strings in different lines
	
	Constraints :
	1 <= n <= 10^6
	
	Sample Input:
	23
	
	Sample Output:
	ad
	ae
	af
	bd
	be
	bf
	cd
	ce
	cf

************/

/* **********

import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		solution.printKeypad(input);
	}
}

************/

public class PrintKeypad {

	public static String[] returnAllKeypadComb(int n) {

		if(n == 0) {
			String[] baseCaseArray = {""};
			return baseCaseArray;
		}

		String[] ronCombinations = returnAllKeypadComb(n / 10);
		String[] currentNumCombinations = keypad(n % 10);
		String[] totalCombinations = new String[ronCombinations.length * currentNumCombinations.length];

		int k = 0;
		for(String str1 : ronCombinations) {
			for(String str2 : currentNumCombinations) {
				totalCombinations[k++] = str1 + str2;
			}
		}
		return totalCombinations;

	}

	public static String[] keypad(int num) {

		if(num == 2) {
			String[] retVal = {"a", "b", "c"};
			return retVal;
		}
		else if(num == 3) {
			String[] retVal = {"d", "e", "f"};
			return retVal;
		}
		else if(num == 4) {
			String[] retVal = {"g", "h", "i"};
			return retVal;
		}
		else if(num == 5) {
			String[] retVal = {"j", "k", "l"};
			return retVal;
		}
		else if(num == 6) {
			String[] retVal = {"m", "n", "o"};
			return retVal;
		}
		else if(num == 7) {
			String[] retVal = {"p", "q", "r", "s"};
			return retVal;
		}
		else if(num == 8) {
			String[] retVal = {"t", "u", "v"};
			return retVal;
		}
		else if(num == 9) {
			String[] retVal = {"w", "x", "y", "z"};
			return retVal;
		}
		else {
			String[] retVal = {};
			return retVal;
		}

	}

	public static void printKeypad(int input){

		String output[] = returnAllKeypadComb(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
    
}
