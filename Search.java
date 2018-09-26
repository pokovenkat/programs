import java.util.Scanner;
import java.util.TreeSet;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>();
		int n=sc.nextInt();
		int key=sc.nextInt();
		for(int i=0;i<n;i++) {
			ts.add(sc.nextInt());
		}
		if(ts.contains(key)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
