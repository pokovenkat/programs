
import java.util.Scanner;

public class anagram {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);	
	int n=sc.nextInt();
	int count=0;
	String input[]=new String[n];
	for(int i=0;i<n;i++) {
		input[i]=sc.next();
	}
	if(n==1){
		count=1;
	}
	else{
		for(int i=0;i<n;i++) {
			int l1=input[i].length();
			for(int j=i+1;j<n;j++) {
				int l2=input[j].length();
				if(l1==l2) {
					if(isAnagram(input[i],input[j])) {
						count++;
					}
				}
			}

		}
	}
	System.out.println(count);
}
public static int[] countLetters(String s) {
	int letter[]=new int [26];
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		int index=c-'a';
		letter[index]++;
	}
	return letter;
}
public  static boolean isAnagram(String s1,String s2) {
	int l1[]=countLetters(s1);
	int l2[]=countLetters(s2);
	for(int i=0;i<26;i++) {
		if(l1[i]!=l2[i]) {
			return false;
		}
	}
	return true;
}
}
