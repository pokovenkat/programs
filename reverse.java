import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String input=sc.nextLine();
          StringBuilder sb=new StringBuilder(input);
          String output=sb.reverse().toString();
          System.out.println(output);
	}

}
