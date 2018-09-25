package codekata;

import java.util.Scanner;


public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);	
		int n=sc.nextInt();
		if(isprime(n)) {
			System.out.println(n);
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					if(isprime(i)) {
						System.out.println(i);
					}
				}
			}
		}
	}
	public static boolean isprime(int n) {
		if(n==2)
			return true;
		if(n>2) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}


}
