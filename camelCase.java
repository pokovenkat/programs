import java.util.Scanner;

public class camelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String output="";
		String Space=" ";
		String in[]=input.split(" ");
		for(int i=0;i<in.length;i++) {
			int len=in[i].length();
			String First=in[i].substring(0, 1).toUpperCase();
			String last=in[i].substring(1,len);
			output+=First+last;
			if(i!=in.length-1) {
				output+=Space;
			}
		}
		System.out.println(output);
	}

}
