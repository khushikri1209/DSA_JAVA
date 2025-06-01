 public class J05PostorderTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        } 
    }

    // Postorder Traversal: Left -> Right -> Root
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        J05PostorderTraversal tree = new J05PostorderTraversal();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Postorder traversal of binary tree:");
        tree.postorder(root);
    }
}
 