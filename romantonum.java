import java.util.Scanner;

public class roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      int output=0;
      boolean four=input.contains("IV");
      if(four) {
    	  output=output+4;
    	  input=input.replaceAll("IV","");
      }
      boolean nine=input.contains("IX");
      if(nine) {
    	  output=output+9;
    	  input=input.replaceAll("IX","");
      }
      for(int i=0;i<input.length();i++) {
    	  char c=input.charAt(i);
    	  if(c=='I'){
    		  output=output+1;
    	  }
    	  if(c=='V') {
    		  output=output+5;
    	  }
    	  if(c=='X') {
    		  output=output+10;
    	  }
      }
      System.out.println(output);
	}

}
