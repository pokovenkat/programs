import java.util.Scanner;

public class BalanceParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l1=s.length();
		int opencount=0;
		int closecount=0;
		for(int i=0;i<l1;i++) {
    		char c=s.charAt(i);
    		if(c=='(') {
    			opencount++;
    		}
    		if((c==')')&&(opencount>closecount)) {
    			closecount++;
    		}
		}
		if(opencount==closecount) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
