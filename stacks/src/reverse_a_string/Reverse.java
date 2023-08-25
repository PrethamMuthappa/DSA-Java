package reverse_a_string;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		rev rr=new rev();
		rr.stringrev();
 
	}

}


class rev{
	
	Stack<String> stack=new Stack<String>();
	Scanner sc=new Scanner(System.in);
	
	public void stringrev() {
		System.out.println("ENTER YOUR STRING \n");
		String ch=sc.nextLine();
		
		for(int i=0;i<ch.length();i++) {
			
			String abc=String.valueOf(ch.charAt(i));
			
			stack.push(abc);
		}
		
		System.out.println(stack);
		
		for(int j=0;j<stack.size();i--) {
			
		}
		
	
			
		
	}
}