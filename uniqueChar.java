import java.util.Scanner;

public class uniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String out="";
		s=s.replaceAll(" ","").toLowerCase();
		while(s.length()!=0) {
			String c=String.valueOf(s.charAt(0));
			s=s.replaceFirst(c, "");
			if(!s.contains(c)) {
				out+=c+" ";
			}
			else {
				s=s.replaceAll(c, "");
			}
		}
		System.out.println(out);
	}

}
