

import java.util.Scanner;

public class MaxCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String maxChar="";
		int maxcount=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			String s=String.valueOf(str.charAt(i));
			while(str.contains(s)) {
				count+=1;
				str=str.replaceFirst(s, "");
			}
			if(count>maxcount) {
				maxcount=count;
				maxChar=s;
			}
			count=0;
		}
		System.out.println(maxChar);
	}

}
