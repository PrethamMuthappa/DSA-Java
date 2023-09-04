// Node class to represent individual elements in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the list
class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // Insert a new element at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Search for a specific element in the linked list
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Delete a specific element from the linked list
    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.append(1);
        myList.append(2);
        myList.append(3);

        System.out.println("Linked List:");
        myList.display();

        System.out.println("Search for 2: " + myList.search(2));
        System.out.println("Search for 4: " + myList.search(4));

        myList.delete(2);
        System.out.println("Linked List after deleting 2:");
        myList.display();
    }
}
