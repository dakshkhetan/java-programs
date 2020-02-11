package Recursion1;

/* **********

	Geometric Sum
	
	Given k, find the geometric sum i.e.
	1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
	using recursion. Return the answer.
	
	Sample Input :
	3
	
	Sample Output :
	1.875

************/

/* **********

import java.text.DecimalFormat;
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}

************/

public class GeometricSum {

	public static double findGeometricSum(int k) {
		
      	if (k == 0) {
			return 1;
		} 
		
		double smallAns = 1/Math.pow(2, k);
		double result = smallAns + findGeometricSum(k - 1);
		return result;

	}
}
