public class J09BinaryTreeSearch {
    
    // Node structure
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Function to search a node
    static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        // Recursively search left and right subtrees
        return search(root.left, key) || search(root.right, key);
    }

    public static void main(String[] args) {
        // Sample Tree:
        //        10
        //       /  \
        //     20    30
        //    / \   /
        //   40 50 60

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);

        int key = 50;

        if (search(root, key))
            System.out.println("Node " + key + " found in the tree.");
        else
            System.out.println("Node " + key + " not found in the tree.");
    }
}
