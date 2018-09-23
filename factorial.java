import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int output=1;
        for(int i=1;i<=input;i++) {
        	output=output*i;
        }
        System.out.println(output);
	}

}
