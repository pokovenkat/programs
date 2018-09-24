import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		int shiftTimes=sc.nextInt();
		int []array=new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			array[i]=sc.nextInt();
		}
		for(int times=0;times<shiftTimes;times++) {
			array=rightShifting(array, arraySize);
		}
		for(int i=0;i<arraySize;i++) {
			System.out.print(array[i]+" ");
		}
			
	}
	public  static int[] rightShifting(int a[],int n) {
		int output[]=new int[n];
		output[0]=a[n-1];
		for(int i=0;i<n-1;i++) {
			output[i+1]=a[i];
		}
		return output;
	}

}
