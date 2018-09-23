import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
	int rev=0;
        while(input>0){
		int r=input%10;
		rev=(rev*10)+r;
		input=input/10;
	}
	        System.out.println(rev);
	}

}

        
