package linkedList;

import java.util.LinkedList;

public class Ll {
 
	public static void main(String[] args) {
		
		linkprint ll=new linkprint();
		
		// link ls=new link();
		// ls.ll();
		
		/* THIS IS FOR INSERTING ELEMENT MANUALLY 
		 * 
		//creating objects and inserting
		Node p1=new Node(10);
		Node p2=new Node(20);
		Node p3=new Node(30);
		Node p4=new Node(40);
		
		// adding address|| reference of next node
		ll.head=p1;
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		*/
		
		ll.add(10);
		ll.add(20);
		ll.printing();
	   
	}
}

// class used for printing 
class linkprint{
	
	Node head;
	void printing() {
		
		Node current=this.head;
		
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	void add(int element) {
		Node temp=new Node(element);
		if(head==null) {
			head=temp;
		}
		else {
			Node current=head;
			
			while(current.next!=null) {
				current=current.next;
						
			}
			current.next=temp;
		}
	}
}

// this class is using linked list using java collection 
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