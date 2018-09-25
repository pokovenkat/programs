import java.util.Scanner;

public class SameLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int line[][]=new int[3][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				line[i][j]=sc.nextInt();
			}
		}
		if(xaxis(line)) {
			System.out.println("yes");
		}
		else if(yaxis(line)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	public static boolean xaxis(int line[][]) {
		int val=line[0][0];
		if((line[1][0]==val)&&(line[2][0]==val))
			return true;
		return false;
	}
	public static boolean yaxis(int line[][]) {
		int val=line[0][1];
		if((line[1][1]==val)&&(line[2][1]==val))
			return true;
		return false;
	}
}
