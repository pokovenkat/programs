import java.util.Scanner;

public class PrefectSquareInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int count=0;
		for(int i=l;i<=r;i++) {
			if(isPerfectSquare(i)){
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean isPerfectSquare(int n) {
		for(int i=1;i<=n;i++) {
			if((i*i)==n)
			{
				return true;
			}
		}
		return false;
	}

}
