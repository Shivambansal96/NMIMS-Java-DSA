
public class Day9BT {

    int i = -1;

    public class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(int[] nodes) {
        i++;
        if (nodes[i] == -1) {
            return null;
            // return new Node(null);
        }

        Node newNode = new Node(nodes[i]); // newNode.data = 3
        newNode.left = insert(nodes);
        newNode.right = insert(nodes);

        return newNode;
    }

    public void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }

    public void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");

    }

    public int treeHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int sumOfAllNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfAllNodes(root.left); // Correct Code
        int rightSum = sumOfAllNodes(root.right); // Correct Code

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        Day9BT bt = new Day9BT();
        int[] nodes = {3, 1, -1, 7, -1, -1, 8, -1, -1};
        // int[] nodes = {3, -1, -1};

        Node root = bt.insert(nodes);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.left.right.data);
        // System.out.println(root.right.data);
        // System.out.println(root.right.left.data);
        // System.out.println(root.right.right.data);

        // bt.preOrder(root);
        // bt.inOrder(root);
        // bt.postOrder(root);
        int res = bt.sumOfAllNodes(root);
        System.out.println(res);
    }
}
