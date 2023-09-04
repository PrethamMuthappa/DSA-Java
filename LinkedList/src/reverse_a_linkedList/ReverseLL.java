package reverse_a_linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLL {

	public static void main(String[] args) {
		
     revll lls=new revll();
     lls.rev();
	}

}

class revll{
	Scanner sc=new Scanner(System.in);
	LinkedList<Integer> ll=new LinkedList<Integer>();
	Iterator<Integer> iterator=ll.iterator();
	void rev() {
		
		System.out.println("ENTER DATA TO LL \n");
		for(int i=0;i<5;i++) {
			int d=sc.nextInt();
			ll.add(d);
		}
		System.out.println("original linked list"+ll);
		
		LinkedList<Integer>revlink=new LinkedList<Integer>();
		Iterator<Integer> revit=ll.descendingIterator();
		while(revit.hasNext()) {
		int elements=revit.next();
		revlink.add(elements);
		}
		System.out.println("reversed linked list"+ revlink);
		
		
		
		
	}
}