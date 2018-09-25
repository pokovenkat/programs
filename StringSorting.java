import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<String> narr=new TreeSet<String>();
		for(int i=0;i<n;i++) {
			narr.add(sc.next());
		}
			Iterator<String> itr = narr.iterator();
		    while (itr.hasNext()) {
		        System.out.println(itr.next());
		    }
	}

}
