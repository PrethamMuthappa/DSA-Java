package reverse_a_string;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		rev rr=new rev();
		rr.stringrev();
	}
}

class rev  {
	
	Stack<String> stack=new Stack<String>();
	Scanner sc=new Scanner(System.in);
	String abc;
	
	public void stringrev() {
		System.out.println("ENTER YOUR STRING \n");
		String ch=sc.nextLine();
		
		for(int i=0;i<ch.length();i++) {
			
			abc=String.valueOf(ch.charAt(i));
			
			stack.push(abc);
		}
	       System.out.println("THE REVERSE OF STRING IS \n");
			while(!stack.empty())
			{
			String mypoped = stack.pop();
			System.out.print(mypoped);
			}

		System.out.println();
	}
}
