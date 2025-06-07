public class J11DelationBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to delete the entire binary tree
    public static void deleteTree(Node root) {
        if (root == null)
            return;

        // Recursively delete left and right subtrees
        deleteTree(root.left);
        deleteTree(root.right);

        // After children are deleted, delete current node
        System.out.println("Deleting node: " + root.data);
        root.left = null;
        root.right = null;
    }

    public static void main(String[] args) {
        // Build sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Deleting entire binary tree:");
        deleteTree(root);

        // After deletion, root still points to original node,
        // but its children are null. To completely remove reference:
        root = null;

        System.out.println("Binary tree deleted.");
    }
}

    
