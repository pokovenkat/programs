import java.util.Scanner;

public class DigitOcuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		int a[]=new int[10];
		while(s.length()!=0) {
			int n=Integer.parseInt(String.valueOf(s.charAt(0)));
			a[n]++;
			s=s.substring(1);
		}
		System.out.println(a[k]);
	}

}
