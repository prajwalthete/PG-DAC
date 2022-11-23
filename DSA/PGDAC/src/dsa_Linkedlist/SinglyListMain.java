package dsa_Linkedlist;

import java.util.Scanner;

class SinglyList {
	// Node is static member class of SinglyList
	static class Node {
		private int data;
		private Node next;

		// Node class methods
		public Node() {

			data = 0;
			next = null;
		}

		public Node(int val) {

			this.data = val;
			this.next = null;
		}

	}

	// List class method
	private Node head;

	// list class field
	public SinglyList() {
		this.head = null;
	}

	void display() {
		System.out.println("List : ");
		Node trav = head; // will give me address of first Node
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;

		}
		System.out.println("");

	}

	void addFirst(int val) {
		// Initialize new Node
		Node newNode = new Node(val);
		// newNode next should contain firstNode address
		newNode.next = head;
		// head should be the newNode
		head = newNode;

	}

	void addLast(int val) {
		// create new node
		Node newNode = new Node(val);
		// special case if list is empty make newNode as first node of list
		if (head == null) {
			head = newNode;
		} else {// add node at the end

			// traverse till last node
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			// add new node into next of last node
			trav.next = newNode;
		}

	}

	public void addAtPos(int val, int pos) {
		// special 1: if list is empty, add node at the start
		// special 2: if pos<=1, add node at the start
		if (head == null || pos <= 1)
			addFirst(val);
		// general: add node at given pos
		else {
			// allocate & init new node
			Node newNode = new Node(val);
			// traverse till pos-1 (trav)
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				// special 3: if pos > length of list, add node at the end.
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			// newnode's next should point to trav's next
			newNode.next = trav.next;
			// trav's next should pointer to new node
			trav.next = newNode;
		}
	}

	public void deleteAll() {
		head = null;
		// all nodes will be garbage collected
	}

	public void deleteAtPos() {
		// TODO Auto-generated method stub
		
	}

	// .....

}

public class SinglyListMain {
	public static void main(String[] args) {
		int choice, val, pos;
		SinglyList list = new SinglyList();// object of SinglyList
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.display();
				break;
			case 2: // Add First
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				list.addFirst(val);

				break;
			case 3: // Add Last
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				list.addLast(val);

				break;
			case 4: // Add At Pos
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				System.out.print("Enter the Position: ");
				pos = sc.nextInt();
				list.addAtPos(val, pos);

				break;
			case 5: // Del First

				break;
			case 6: // Del Last

				break;
			case 7: // Del At Pos
				list.deleteAtPos();

				break;
			case 8: // Del All
				list.deleteAll();

				break;
			}
		} while (choice != 0);
		sc.close();
	}
}
