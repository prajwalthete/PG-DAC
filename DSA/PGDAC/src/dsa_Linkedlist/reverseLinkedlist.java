package dsa_Linkedlist;

public class reverseLinkedlist {
	// Java program for reversing the linked list
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		reverseLinkedlist list = new reverseLinkedlist();

		head = new Node(95);
		head.next = new Node(75);
		head.next.next = new Node(10);
		head.next.next.next = new Node(20);

		System.out.println("Given linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}

/*
 * class Node { int data = 0; Node next = null;
 * 
 * Node() { } // default / non parameterized
 * 
 * Node(int data) { // parameterized this.data = data; }
 * 
 * Node(int data, Node next) { // parameterized this.data = data; this.next =
 * next; } }
 * 
 * // reverse of Linked-list (keycode 206) public static Node reverseOfLL(Node
 * head) { // main logic Node curr = head; Node prev = null;
 * 
 * while (curr != null) { Node temp = curr.next;
 * 
 * curr.next = prev;
 * 
 * prev = curr; curr = temp; } return prev; }
 * 
 * // check palindrome linkedlist (leetcode 234) public Node mid(Node head) {
 * Node fast = head, slow = head; while (fast.next != null && fast.next.next !=
 * null) { slow = slow.next; fast = fast.next.next; } return slow; }
 * 
 * public Node reverse(Node head) { Node curr = head; Node prev = null; while
 * (curr != null) { Node temp = curr.next; curr.next = prev; prev = curr; curr =
 * temp; } return prev; }
 * 
 * public boolean isPalindrome(Node head) {
 * 
 * if (head == null || head.next == null) { return true; }
 * 
 * Node mid = mid(head); Node mid01 = mid.next;
 * 
 * mid.next = null;
 * 
 * mid01 = reverse(mid01);
 * 
 * while (head != null && mid01 != null) { if (head.data != mid01.data) { return
 * false; } head = head.next; mid01 = mid01.next; } return true; }
 */
