package test;

import java.util.Scanner;

public class Links {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		inserting ins=new inserting();
		
		for(;;) {
			System.out.println("1 INSERT DATA 2 DISPLAY 3 DELETE 4 EXIT \n");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("ENTER DATA \n");
			int data=sc.nextInt();
			ins.add(data);
			break;
			case 2:ins.display();
			break;
			case 3:System.out.println("ENTER DATA TO DELETE \n");
			int del=sc.nextInt();
			ins.delete(del);
		    break;
			case 4:System.exit(0);
			sc.close();
			Runtime.getRuntime().gc();
			}
		}
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

class inserting{
	Node head;
	void add(int element) {
		
		Node temp=new Node(element);
		
		if(head==null) {
			
			head=temp;
		}
		else {
			Node current =head;
			while(current.next!=null) {
				current=current.next;
				
			}
			current.next=temp;
		}
	};
	void display() {	
		Node current=this.head;
		if(current==null) {
			System.out.println("EMPTY LIST");
			return;
		}
		while(current!=null) {
			
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	void delete(int element) {
		 	
		if(head==null) {
			return;
		}
		
		if(head.data==element) {
			head=head.next;
		}
		
		Node current=head;
		
		
		while(current!=null) {
			
		
		if(current.next.data==element) {
			current.next=current.next.next;
			return;
		}
		current=current.next;
		}
	}
}
