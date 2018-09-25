
import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toUpperCase();
		String output="";
		String letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int index=((c-'A')+3)%26;
			output+=String.valueOf(letter.charAt(index));
		}
		System.out.println(output);
	}

}
