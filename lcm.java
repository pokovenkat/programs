import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=(a*b)/gcdNumber(a, b);
		System.out.println(lcm);
	}
	public static int gcdNumber(int a,int b){ 
	    if (a == 0 || b == 0) 
	       return 0; 
	    if(a==1)
	    	return a;
	    if(b==1)
	    	return b;
	    if (a == b) 
	        return a; 
	    if (a > b) 
	        return gcdNumber(a-b, b); 
	    return gcdNumber(a, b-a); 
	}
}
