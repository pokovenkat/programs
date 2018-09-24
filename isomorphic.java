

import java.util.Scanner;

public class isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 String s1=sc.nextLine();
 String s2=sc.nextLine();
 int l1=s1.length();
 int l2=s2.length();
 if(l1!=l2) {
	 System.out.println("not isomorphic");
 }
 else {
	 int k=0;
 for(int i=0;i<l1;i++) {
	 char c1=s1.charAt(i);
	 char c2=s2.charAt(i);
	 if(!Character.isDigit(c1))
		 s1=s1.replaceAll(String.valueOf(c1),String.valueOf(k));
	 if(!Character.isDigit(c2))
		 s2=s2.replaceAll(String.valueOf(c2),String.valueOf(k));
	 k++;
 }
 int a=Integer.parseInt(s1);
 int b=Integer.parseInt(s2);
 if(a==b) {
	 System.out.println("isomorphic ");
	 }
 else {
	 System.out.println("not isomorphic");
 }
 }
	}

}
