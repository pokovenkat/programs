import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n=sc.nextDouble();
		double x=(Math.log10(n)/Math.log10(2));
		if(Math.ceil(x)==Math.floor(x)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
