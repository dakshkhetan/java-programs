package Recursion1;

/* **********

	Tower of Hanoi
	
	Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. 
	The objective of the puzzle is to move all disks from source rod to destination 
	rod using third rod (say auxiliary). 
	The rules are :
	1) Only one disk can be moved at a time.
	2) A disk can be moved only if it is on the top of a rod.
	3) No disk can be placed on the top of a smaller disk.
	Print the steps required to move n disks from source rod to destination rod.
	Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.
	
	Input Format :
	Integer n
	
	Output Format :
	Steps in different lines (in one line print source and destination rod name separated by space)
	
	Sample Input :
	2
	
	Sample Output :
	a b
	a c
	b c

************/

/* **********

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		solution.towerOfHanoi(n, 'a', 'b', 'c');
	}
}

************/

public class TowerOfHanoi {

	public static void towerOfHanoi(int n, char source, char aux, char destination ) {

		if(n == 0) {
			return;
		}
		
		towerOfHanoi(n - 1, source, destination, aux);
		System.out.println(source + " " + destination);
		towerOfHanoi(n - 1, aux, source, destination);
		
	}
}
