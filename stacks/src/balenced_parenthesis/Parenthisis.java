package balenced_parenthesis;

import java.util.Scanner;
import java.util.Stack;

public class Parenthisis {

	public static void main(String[] args) {
	
		checks cc=new checks();
		cc.checking();
 
	}

}

class checks{
	Stack<String> stack=new Stack<String>();
	Scanner sc=new Scanner(System.in);
	public void checking() {
		
	System.out.println("enter patterns");
	String pattern=sc.nextLine();
	
	for(int i=0;i<pattern.length();i++) {
		
		if(pattern=="(") {
			
			stack.push("(");
			
		}
		
		System.out.println(stack);
		
	}
		
	}
}
