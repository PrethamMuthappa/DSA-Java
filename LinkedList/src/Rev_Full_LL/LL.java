package Rev_Full_LL;

public class LL {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.display();
		ll.rev();
		ll.display();

	}

}

class Node{
	
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
}

class LinkedList{
	Node head;
	void add(int element) {
	
			Node temp=new Node(element);
			
		if(head==null) {
			head=temp;
		}
		else {
			Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
		}
	}
	
	void display() {
		Node current=this.head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	void rev() {
		Node prev = null;
		Node next;
		Node current=head;;
		if(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		head=prev;
	}
	}

