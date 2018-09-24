

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		int mid=len/2;
		StringBuilder sb1=new StringBuilder(s.substring(0,mid));		
		StringBuilder sb2=new StringBuilder(s.substring(mid,len));		
		sb1.reverse();
		sb2.reverse();
		String output=sb1.toString()+sb2.toString();
		System.out.println(output);
	}

}
