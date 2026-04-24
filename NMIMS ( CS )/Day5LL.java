// public class Day5LL {

//     public static int countPathMaze(int i, int j, int n, int m) {
//         if(i == n - 1 && j == m - 1)
//             return 1;
//         if(i == n || j == m)
//             return 0;
//         // Move Down
//         int downPath = countPathMaze(i+1, j, n, m);
//         // Move Right
//         int rightPath = countPathMaze(i, j+1, n, m);
//         return downPath + rightPath;
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 4;
//         int res = countPathMaze(0, 0, n, m);
//         System.out.println(res);
//     }
// }
// // ! Single Linked List.
// public class Day5LL {
//     Node head;
//     int size;
//     class Node {
//         int val;
//         Node next = null;
//         Node(int value) {
//             this.val = value;
//         }
//     }
//     public void prepend(int val) {
//         Node newNode = new Node(val);
//         size++;
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void append(int val) {
//         Node newNode = new Node(val);
//         size++;
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;
//     }
//     public void deleteStart() {
//         if (head == null) {
//             System.out.println("List is Empty!!!");
//             return;
//         }
//         head = head.next;
//         size--;
//     }
//     public void deleteEnd() {
//         if (head == null) {
//             System.out.println("List is Empty!!!");
//             return;
//         }
//         size--;
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode.next.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = null;
//     }
//     public int size() {
//         return size;
//     }
//     public void printList() {
//         Node currentNode = head;
//         while (currentNode != null) {
//             System.out.print(currentNode.val + " -> ");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         Day5LL list = new Day5LL();
//         list.prepend(1);
//         System.out.println("Size of LL = " + list.size());
//         list.append(20);
//         list.append(2000);
//         list.printList();
//         list.deleteStart();
//         list.append(100);
//         list.printList();
//         list.deleteEnd();
//         list.printList();
//         System.out.println("Size of LL = " + list.size());
//     }
// }
// ! Doubly Linked List.
public class Day5LL {

    Node head;
    Node tail;
    int size;

    class Node {

        int val;
        Node next = null;
        Node prev = null;

        Node(int value) {
            this.val = value;
        }
    }

    public void prepend(int val) {
        Node newNode = new Node(val);

        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void append(int val) {
        Node newNode = new Node(val);

        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;

        size--;

    }

    public void deleteEnd() {
        // LL has 0 Nodes
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        size--;
        // LL has 1 Node
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        // LL has more than 1 Nodes
        tail = tail.prev;
        tail.next = null;

    }

    public int size() {

        return size;
    }

    public void reverseList() {
        Node currentNode = tail;

        while (currentNode != null) {
            System.out.print(currentNode.val + " <-> ");
            currentNode = currentNode.prev;
        }

        System.out.println("null");
    }

    public void printList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.val + " <-> ");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Day5LL list = new Day5LL();

        list.prepend(1);
        list.append(100);
        list.prepend(1);
        // System.out.println("Size of LL = " + list.size());
        list.append(20);
        list.append(2000);

        list.printList();
        list.deleteStart();
        // list.append(100);
        list.printList();
        list.deleteEnd();

        list.printList();
        System.out.println("--------------------");
        list.reverseList();
        // System.out.println("Size of LL = " + list.size());
    }
}
