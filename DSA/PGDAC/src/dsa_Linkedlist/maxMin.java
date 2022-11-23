/*
2. Find the largest and smallest element from the linked list

*/
package dsa_Linkedlist;

class maxMin {

    // Represent a node of the singly linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
        }
        tail = newNode;
    }

    // minNode() will find out the minimum value node in the list
    public void minNode() {
        Node current = head;
        int min;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            // Initializing min with head node data
            min = head.data;

            while (current != null) {
                // If current node's data is smaller than min
                // Then, replace value of min with current node's data
                if (min > current.data) {
                    min = current.data;
                }
                current = current.next;
            }
            System.out.println("Minimum value node in the list is : " + min);
        }
    }

    // maxNode() will find out the maximum value node in the list
    public void maxNode() {
        Node current = head;
        int max;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            // Initializing max with head node data
            max = head.data;

            while (current != null) {
                // If current node's data is greater than max
                // Then, replace value of max with current node's data
                if (max < current.data) {
                    max = current.data;
                }
                current = current.next;
            }
            System.out.println("Maximum value node in the list is: " + max);
        }
    }

    public static void main(String[] args) {

        maxMin sList = new maxMin();

        // Adds data to the list
        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(50);
        sList.addNode(40);

        // Display the minimum value node in the list
        sList.minNode();

        // Display the maximum value node in the list
        sList.maxNode();
    }
}