import java.util.Scanner;

public class removeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		String out=str.replaceAll(" ","");
		System.out.println(out);
	}

}
