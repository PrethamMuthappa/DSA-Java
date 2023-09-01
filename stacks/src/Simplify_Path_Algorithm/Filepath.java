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
		
		
	}
}