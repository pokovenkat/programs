import java.util.Scanner;

public class StringNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		if(isNumeric(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	public static boolean isNumeric(String str) {
		for (int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(!Character.isDigit(ch)) {
				return false;
			}
	}
		return true;
	}
}
