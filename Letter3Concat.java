import java.util.Scanner;
public class Letter3Concat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		String output=String.valueOf(input.charAt(0));
		input=input.substring(1);
		int len=input.length();
		for(int i=2;i<len;i=i+3) {
			output+=String.valueOf(input.charAt(i));
		}
		System.out.println(output);
	}
}
