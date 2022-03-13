package AssignTwo;

import java.util.*;
public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		 for (int i = 0; i < a; i++) {
			  
	            System.out.print(fibo(i) + " ");
	        }
//		System.out.println(fibo(a));
		
	}
	
	public static int fibo(int n) {
		if(n <=1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
}
