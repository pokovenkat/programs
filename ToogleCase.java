import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		String out="";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isLowerCase(c)) {
				out+=String.valueOf(Character.toUpperCase(c));
			}
			if(Character.isUpperCase(c)) {
				out+=String.valueOf(Character.toLowerCase(c));
			}
		}
		System.out.println(out);

	}
