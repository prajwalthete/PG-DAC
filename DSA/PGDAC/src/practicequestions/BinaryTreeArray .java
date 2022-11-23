package practicequestions;

class BinaryTreeArray {
/*

         D
        / \
       /   \
      /     \
     A       F
    / \     / \
   /   \   /   \
  E     B R     T
 / \     /     / \
G   Q   V     J   L
*/

    public static int completeNode = 15;

    // array to store the tree
    public static char[] tree = {'\0', 'A', 'B', 'F', 'E', 'Z', 'T', 'R', 'G', 'Q', '\0', '\0', 'V', '\0', 'J', 'L'};

    public static int getRightChild(int index) {
        // node is not null
        // and the result must lie within the number of nodes for a complete binary tree
        if (tree[index] != '\0' && ((2 * index) + 1) <= completeNode)
            return (2 * index) + 1;
        // right child doesn't exist
        return -1;
    }

    public static int getLeftChild(int index) {
        // node is not null
        // and the result must lie within the number of nodes for a complete binary tree
        if (tree[index] != '\0' && (2 * index) <= completeNode)
            return 2 * index;
        // left child doesn't exist
        return -1;
    }

    public static int getParent(int index) {
        if (tree[index] != '\0' && index / 2 != '\0')
            return index / 2;
        else
            return -1;
    }

    public static void preorder(int index) {
        // checking for valid index and null node
        if (index > 0 && tree[index] != '\0') {
            System.out.print(" " + tree[index] + " "); // visiting root
            preorder(getLeftChild(index)); //visiting left subtree
            preorder(getRightChild(index)); //visiting right subtree
        }
    }

    public static void postorder(int index) {
        // checking for valid index and null node
        if (index > 0 && tree[index] != '\0') {
            postorder(getLeftChild(index)); //visiting left subtree
            postorder(getRightChild(index)); //visiting right subtree
            System.out.print(" " + tree[index] + " "); //visiting root
        }
    }

    public static void inorder(int index) {
        // checking for valid index and null node
        if (index > 0 && tree[index] != '\0') {
            inorder(getLeftChild(index)); //visiting left subtree
            System.out.print(" " + tree[index] + " "); //visiting root
            inorder(getRightChild(index)); // visiting right subtree
        }
    }

    public static void main(String[] args) {
        System.out.print("Preorder:\n");
        preorder(1);
        System.out.print("\nPostorder:\n");
        postorder(1);
        System.out.print("\nInorder:\n");
        inorder(1);
        System.out.print("\n");
    }
}