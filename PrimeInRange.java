

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int count=0;
		for(int i=l;i<=r;i++) {
			if(prime(i)) {
				count+=1;
			}
		}
		System.out.println(count);
	}
	public static boolean prime(int n) {
		if(n==2)
			return true;
		if(n==1)
			return false;
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
