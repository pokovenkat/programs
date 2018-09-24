

import java.util.Scanner;

public class NumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		int []array=new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			array[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<arraySize-1;i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(array[i]==array[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
					System.out.println(array[i]);
					break;
				}
			if(flag==1) {
				flag=0;
			}
			}
		}

}
