import java.util.Scanner;

public class ReverseWithoutVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		str=sb.reverse().toString();
		str=str.replaceAll("a","");
		str=str.replaceAll("e","");
		str=str.replaceAll("i","");
		str=str.replaceAll("o","");
		str=str.replaceAll("u","");
		str=str.replaceAll("A","");
		str=str.replaceAll("E","");
		str=str.replaceAll("I","");
		str=str.replaceAll("O","");
		str=str.replaceAll("U","");
		System.out.println(str);
	}

}
