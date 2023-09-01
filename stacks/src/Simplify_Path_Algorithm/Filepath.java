package Simplify_Path_Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Filepath {

	public static void main(String[] args) {
		
    unixfile uf=new unixfile();
    uf.files();
		
	}

}


class unixfile{
	Scanner sc=new Scanner(System.in);
	Stack<String> stack=new Stack<String>();
	
	public void files() {
		
		System.out.println("ENTER YOUR FILE PATH");
		String path=sc.nextLine();
		
   String[] simppath=path.split("/");
   
   for(String i : simppath) {
	   if(i.equals("")|| i.equals(".")) {
		   continue;
	   }
	   else if(i.equals("..")){
		   if(!stack.isEmpty()) {
			   stack.pop();
		   }
	   }else {
		   stack.push(i);
	   }
   }
   
   StringBuilder strngbuilds=new StringBuilder();
   for(String dir : stack) {
	   strngbuilds.append("/");
	   strngbuilds.append(dir);
	   
   }
   if(strngbuilds.length()==0) {
	   strngbuilds.append("/");
   }
   System.out.println("Simplified Path: " + strngbuilds.toString());
		
		
		
	}
}