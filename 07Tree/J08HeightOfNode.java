public class J08HeightOfNode {
    
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to calculate height of a given node
    public static int getHeight(Node node) {
        if (node == null)
            return -1; // Return -1 if counting edges; use 0 if counting nodes

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Create Binary Tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);

        System.out.println("Height of the tree: " + getHeight(root));
        System.out.println("Height of node 2: " + getHeight(root.left));
        System.out.println("Height of node 3: " + getHeight(root.right));
    }
}
