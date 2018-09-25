import java.util.Scanner;
public class DifferK_Char {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
		    String s2=sc.nextLine();
		    int k=sc.nextInt();
		    int l1=s1.length();
		    int l2=s2.length();
		    int same=0;
		    if(l1!=l2) {
		    	System.out.println("no");
		    }
		    else {
		    	for(int i=0;i<l1;i++) {
		    		char c1=s1.charAt(i);
		    		char c2=s2.charAt(i);
		    		if(c1==c2) {
		    			same+=1;
		    		}
		    	}
		    	if(same==l1-k) {
		    		System.out.println("yes");
		    	}
		    	else {
		    		System.out.println(same+"no");
		    	}
		    }
		}
	}



