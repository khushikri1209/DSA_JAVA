public class J07MaximumDepthBinaryTree {

    // Static nested Node class
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to find maximum depth
    public static int maxDepth(Node root) {
        if (root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree:
        /*
             1
           /   \
          2     3
         / \
        4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int depth = maxDepth(root);
        System.out.println("Maximum depth of the binary tree is: " + depth);
    }
}
