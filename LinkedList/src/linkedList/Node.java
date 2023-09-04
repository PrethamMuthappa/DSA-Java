package linkedList;

public class Node {
   // data is what will be stored in data node
  // next is the node referencing too next node || address for next node
	int data;
	Node next;
	
	//constructor or u can create a object as Node node =new Node()
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}
