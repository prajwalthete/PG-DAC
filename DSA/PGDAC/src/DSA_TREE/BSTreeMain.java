package DSA_TREE;

class BinarySearchTree {
    static class Node {
        // Node Fields
        private final int data;
        private Node Left;
        private Node Right;

        public Node() {
            this.data = 0;
            Left = null;
            Right = null;
        }

        public Node(int val) {
            this.data = val;
            Left = null;
            Right = null;
        }

    }

    //Tree fields
    private Node root;

    // Tree Methods
    public BinarySearchTree() {
        root = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (root == null)
            root = newNode;
        else {
            Node trav = root;
            while (true) {
                if (val < trav.data) {
                    if (trav.Left != null)
                        trav = trav.Left;
                    else {// no child in left
                        trav.Left = newNode;
                        break;
                    }
                } else { //if (val>=trav.data)
                    if (trav.Right != null)
                        trav = trav.Right;
                    else {// no child in right
                        trav.Right = newNode;
                        break;
                    }


                }
            }

        }

    }

    public void preorder(Node trav) {//PLR
        if (trav == null) return;
        System.out.print(trav.data + " ,");
        preorder(trav.Left);
        preorder(trav.Right);
    }

    public void inorder() {
        System.out.print("INORDER : ");
        preorder(root);
        System.out.println(" ");
    }

    public void inorder(Node trav) {//LPR
        if (trav == null) return;
        preorder(trav.Left);
        System.out.print(trav.data + " ,");
        preorder(trav.Right);
    }

    public void preorder() {
        System.out.print("PREORDER : ");
        inorder(root);
        System.out.println(" ");
    }

    public void postorder(Node trav) {//LPR
        if (trav == null) return;
        postorder(trav.Left);
        System.out.print(trav.data + " ,");
        postorder(trav.Right);
    }

    public void postorder() {
        System.out.print("POSTORDER : ");
        postorder(root);
        System.out.println(" ");
    }

    private void deleteAll(Node trav) {
        if (trav == null)
            return;
        deleteAll(trav.Left);
        deleteAll(trav.Right);
        trav.Left = null;
        trav.Right = null;
        trav = null;
    }

    public void deleteAll() {
        deleteAll(root);
        root = null;
    }

    public int height(Node trav) {
        if (trav == null)
            return -1;
        int hl = height(trav.Left);
        int hr = height(trav.Right);
        int max = hl > hr ? hl : hr;
        return max + 1;
    }

    public int height() {
        return height(root);
    }


}

public class BSTreeMain {
    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        t.add(60);
        t.add(40);
        t.add(90);
        t.add(50);
        t.add(20);
        t.preorder();
        t.inorder();
        t.postorder();
        System.out.println("Height: " + t.height());

    }
}
