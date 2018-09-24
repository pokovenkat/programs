

import java.util.Scanner;

public class leaveDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();
		if((day.equalsIgnoreCase("sunday"))||(day.equalsIgnoreCase("saturday"))) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
