package codekata;

import java.util.Scanner;

public class islandprb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int count=0;
		int temp;
		if(n==1) {
			temp=sc.nextInt();
			if(temp==1)
				count=1;
		}
		else {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==1) {
					if(isCorrect(a,i,j,n)) {
						count++;
					}
				}
			}
		}
		}
		System.out.println(count);

	}
	
    public static boolean isCorrect(int[][] a,int i,int j,int n) {
    	if((i==0)&&(j==0)&&(a[i+1][j]==0)&&(a[i][j+1]==0))
    		return true;
    	if((i==0)&&(j==n-1)&&(a[i][j-1]==0)&&(a[i+1][j]==0))
    		return true;
    	if((i==n-1)&&(j==n-1)&&(a[i][j-1]==0)&&(a[i-1][j]==0))
    		return true;
    	if((i==n-1)&&(j==0)&&(a[i][j+1]==0)&&(a[i-1][j]==0))
    		return true;
    	if((i==0)&&(j>0)&&(j<n-1)&&(a[i][j-1]==0)&&(a[i][j+1]==0)&&(a[i+1][j]==0))
    		return true;
    	if((i==n-1)&&(j>0)&&(j<n-1)&&(a[i][j-1]==0)&&(a[i][j+1]==0)&&(a[i-1][j]==0))
    		return true;
    	if((j==0)&&(i>0)&&(i<n-1)&&(a[i+1][j]==0)&&(a[i-1][j]==0)&&(a[i][j+1]==0))
    		return true;
    	if((j==n-1)&&(i>0)&&(i<n-1)&&(a[i+1][j]==0)&&(a[i-1][j]==0)&&(a[i][j-1]==0))
    		return true;
    	if((j>0)&&(j<n-1)&&(i>0)&&(i<n-1)&&(a[i+1][j]==0)&&(a[i-1][j]==0)&&(a[i][j+1]==0)&&(a[i][j-1]==0))
    		return true;    	
    	return false;
    }
}
