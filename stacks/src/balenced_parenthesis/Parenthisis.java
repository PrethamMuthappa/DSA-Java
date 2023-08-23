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
	Stack<Character> stack=new Stack<Character>();
	Scanner sc=new Scanner(System.in);
	public void checking() {
		
	System.out.println("enter patterns");
	String pattern=sc.nextLine();
		
    for(char pat :pattern.toCharArray()) {
    	
    	if(pat=='{' || pat=='[' || pat==')') {
    		
    		stack.push(pat);
    		
    	}
    	else if(pat=='}' || pat==']' || pat==')') {
    		
    		if(stack.isEmpty()) {
    			System.out.println("unbalenced parenthisis");
    			return;
    		}else {
    		
    		char popped=stack.pop();
    		
    		if(!bracketsreturn(popped,pat)) {
    			System.out.println("unbalenced parenthisis");
    			
    			return;
    		}
    		
    		}
    		
    		
    		
    	}
    	
    }
    
    if(stack.isEmpty()) {
    	
    	System.out.println("balenced");
    }
    else {
    	System.out.println("unbalenced parenthisis");
    }
		
		
	
	}
	private boolean bracketsreturn(char open, char close) {
		
		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}
}
