package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			starts ss=new starts();
			for(;;)
			{
			System.out.println("1 push 2 pop 3 display 4 exit \n");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:ss.pushing();
			break;
			
			case 2:ss.popping();
			break;
				
			case 3:ss.disp();
			break;
			
			case 4:System.exit(0);
			break;
			}
			}
		}
	}

}

class starts {
	Stack<String> stack=new Stack<String>();
	Scanner sc=new Scanner(System.in);
	public void pushing() {
		
		if(stack.empty()) {
			
			System.out.println("enter the no of  elemtents to enter into stack \n");
			
			int no=sc.nextInt();
			
			for(int i=0;i<=no;i++) {
				
				System.out.println("enter stack elem \n");
				String elem=sc.nextLine();
				stack.push(elem);
			}
		}
		
	}
	
	public void popping() {
              
		if(stack.empty()) {
			System.out.println("stack is empty nothing to pop");
		}
		else {
			String popelem=stack.pop();
			
			System.out.println("popped elements are :- " + popelem);
		}
			}
	
	public void disp() {
		
		if(!stack.empty()) {
			
			for(String itemsss : stack){
				
				System.out.println(itemsss);
			}
		}
		else {
			System.out.println("stack is empty");
		}
	}
}
