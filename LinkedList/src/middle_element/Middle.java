package middle_element;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		finds ff=new finds();
		ff.ML();

	}

}

class finds{
	LinkedList<Integer>ll=new LinkedList<Integer>();
	Scanner sc=new Scanner(System.in);
	
	void ML() {
		System.out.println("enter no of elements \n");
		int n=sc.nextInt();
		System.out.println("enter the elements \n");
		
		for(int i=0;i<n;i++) {
			int data=sc.nextInt();
			ll.add(data);
		}
		Iterator<Integer>slow=ll.iterator();
		Iterator<Integer>fast=ll.iterator();
		
		while(fast.hasNext() && fast.next()!=null) {
			fast.next();
			if(fast.hasNext()) {
				fast.next();
			}
			slow.next();
			
		}
		
		int middle=slow.next();
		System.out.println(middle);
		
	}
}
