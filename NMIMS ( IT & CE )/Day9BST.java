
public class Day9BST {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // ascending Order printing
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // // descending Order printing
    // public void inOrder(Node root) {
    //     if (root == null) {
    //         return;
    //     }
    //     inOrder(root.right);
    //     System.out.print(root.data + " ");
    //     inOrder(root.left);
    // }
    public boolean searchKey(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (key > root.data) {
           return searchKey(root.right, key);
        } else if (key < root.data) {
            return searchKey(root.left, key);
        } else { // key == root.data
            return true;
        }

    }

    public Node deleteNode(Node root, int val) {

        if(val > root.data) {
            root.right = deleteNode(root.right, val);  // 6   
        }

        else if (val < root.data) {
            root.left = deleteNode(root.left, val);
        }


        else { // root.data == val

            // 0 child

            if(root.left == null && root.right == null)
                return null;

            // 1 child
            if(root.left == null) {
                return root.right;
            }

            else if(root.right == null) {
                return root.left;
            }

            // 2 Child
            Node IOS = inOrderSuccessor(root.right);
            root.data = IOS.data;
            root.right = deleteNode(root.right, IOS.data);
        }
        return root;
    }

    public Node inOrderSuccessor(Node root) {

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {

        Day9BST bst = new Day9BST();

        int[] nodes = {3, 1, 5, 6, 2, 8};

        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = bst.insert(root, nodes[i]);
        }

        bst.inOrder(root);

        System.out.println();

        if(bst.searchKey(root, 500)) {
            System.out.println("Key Found");
        }
        else {
            System.out.println("Key Not Found");
        }

        System.out.println();

        bst.deleteNode(root, 3);


        bst.inOrder(root);

    }
}
