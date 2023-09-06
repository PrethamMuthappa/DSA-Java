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
	Iterator<Integer>slow=ll.iterator();
	Iterator<Integer>fast=ll.iterator();
	Scanner sc=new Scanner(System.in);
	
	void ML() {
		System.out.println("enter elements \n");
		
		for(int i=0;i<6;i++) {
			int data=sc.nextInt();
			ll.add(data);
		}
		
		while(slow.hasNext() && fast.hasNext()) {
			if(fast==null) {
				System.out.println(slow);
				return;
			}
		}
		
	}
}
