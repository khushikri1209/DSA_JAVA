import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class J10InsertionBinaryTree {
    Node root;

    void insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                stack.push(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                stack.push(current.right);
            }
        }
    }

    // Inorder Traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        J10InsertionBinaryTree tree = new J10InsertionBinaryTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
    }
}
