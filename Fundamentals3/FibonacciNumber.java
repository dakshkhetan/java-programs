package Fundamentals3;

/* **********
	
	Fibonacci Number
	
	Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
	Fibonacci Series is defined by the recurrence
	    F(n) = F(n-1) + F(n-2)
	
	Input Format :
	Integer N
	
	Output Format :
	true or false
	
	Sample Input 1 :
	5
	
	Sample Output 1 :
	true
	
	Sample Input 2 :
	14
	
	Sample Output 2 :
	false 

************/


public class FibonacciNumber {
	
	public static boolean checkMember(int x){
      
		int t1=1, t2=1, t3=0, flag=0;
		for(int i=0; i<100; i++) {
			t3 = t1 + t2;
			if((x==t1)||(x==t2)||(x==t3)) {
				flag = 1;
				break;
			}
			t1 = t2;
			t2 = t3;	
		}
		if(flag == 1) {
			return true;
		}
		else {
			return false;
		}

	}

}
