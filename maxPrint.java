import java.util.Scanner;
import java.util.TreeSet;

public class maxPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		TreeSet<Integer> narr=new TreeSet<Integer>();
		TreeSet<Integer> karr=new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			narr.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			karr.add(sc.nextInt());
			System.out.println(karr.last());
		}
	}

}
