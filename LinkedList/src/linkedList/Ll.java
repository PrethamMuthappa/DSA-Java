package linkedList;

import java.util.LinkedList;

public class Ll {
 
	public static void main(String[] args) {
		link list=new link();
		list.ll();
	}
}

class link{
	
	void ll() {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		// to add elements to linked list 
		
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		linkedlist.add("e");
		// adding using index 
		linkedlist.add(3,"d");
		
		System.out.println(linkedlist);
		// to check index
		System.out.println(linkedlist.indexOf("e"));
		
		//to check first element || last element of linked list
		
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist.peekLast());
		
		// add element to head || tail
		
		linkedlist.addFirst("0");
		linkedlist.addLast("f");
		
		// to remove first or lasts element in linked list
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		
		
		
		
		
	}
}