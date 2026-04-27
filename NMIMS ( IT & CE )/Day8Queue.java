
// // public class Day8Queue {
// //     Node head;
// //     class Node {
// //         int data;
// //         Node next;
// //         Node(int data) {
// //             this.data = data;
// //             this.next = null;
// //         }
// //     }
// //     public boolean isEmpty() {
// //         return head == null;
// //     }
// //     public void append(int data) {
// //         Node newNode = new Node(data);
// //         if (head == null) {
// //             head = newNode;
// //             return;
// //         }
// //         // head.next = newNode;   CHECK AGAIN
// //         Node currentNode = head;
// //         while (currentNode.next != null) {
// //             currentNode = currentNode.next;
// //         }
// //         currentNode.next = newNode;
// //     }
// //     public void remove() {
// //         if (head == null) {
// //             System.out.println("Queue is Empty");
// //             return;
// //         }
// //         if (head.next == null) {
// //             head = null;
// //             return;
// //         }
// //         head = head.next;
// //     }
// //     public int peek() {
// //         if (isEmpty()) {
// //             return -1;
// //         }
// //         return head.data;
// //     }
// //     public static void main(String[] args) {
// //         Day8Queue q = new Day8Queue();
// //         q.append(10);
// //         q.append(20);
// //         q.append(30);
// //         q.append(40);
// //         q.remove();
// //         while (!q.isEmpty()) {
// //             System.out.println(q.peek());
// //             q.remove();
// //         }
// //         System.out.println();
// //     }
// // }
// public class Day8Queue {
//     Node head;
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public boolean isEmpty() {
//         return head == null;
//     }
//     public void append(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         // head.next = newNode;   CHECK AGAIN
//         Node currentNode = head;
//         while (currentNode.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;
//     }
//     public void remove() {
//         if (head == null) {
//             System.out.println("Queue is Empty");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         head = head.next;
//     }
//     public int peek() {
//         if (isEmpty()) {
//             return -1;
//         }
//         return head.data;
//     }
//     public static void main(String[] args) {
//         Day8Queue q = new Day8Queue();
//         q.append(10);
//         q.append(20);
//         q.append(30);
//         q.append(40);
//         q.remove();
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//         System.out.println();
//     }
// }
// public class Day8Queue {
//     Node head;
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public boolean isEmpty() {
//         return head == null;
//     }
//     public void append(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         // head.next = newNode;   CHECK AGAIN
//         Node currentNode = head;
//         while (currentNode.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;
//     }
//     public void remove() {
//         if (head == null) {
//             System.out.println("Queue is Empty");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         head = head.next;
//     }
//     public int peek() {
//         if (isEmpty()) {
//             return -1;
//         }
//         return head.data;
//     }
//     public static void main(String[] args) {
//         Day8Queue q = new Day8Queue();
//         q.append(10);
//         q.append(20);
//         q.append(30);
//         q.append(40);
//         q.remove();
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//         System.out.println();
//     }
// }
// import java.util.*;
// public class Day8Queue {
//     ArrayList<Integer> arrList = new ArrayList<>();
//     public boolean isEmpty() {
//         return arrList.size() == 0;
//     }
//     public void append(int data) {
//         arrList.add(data);
//     }
//     public void remove() {
//         if(isEmpty()) {
//             System.out.println("Queue is Empty");
//             return;
//         }
//         arrList.remove(arrList.get(0));
//     }
//     public int peek() {
//         if (isEmpty()) {
//             return -1;
//         }
//         return arrList.get(0);
//     }
//     public static void main(String[] args) {
//         Day8Queue q = new Day8Queue();
//         q.append(10);
//         q.append(20);
//         q.append(30);
//         q.append(40);
//         q.remove();
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//         System.out.println();
//     }
// }
// public class Day8Queue {
//     int[] arr;
//     int size;
//     int rear;
//     public Day8Queue(int n) {
//         this.size = 0;
//         this.arr = new int[n];
//         this.rear = -1;
//     }
//     public boolean isEmpty() {
//         // return size == 0;
//         return rear == -1;
//     }
//     public boolean isFull() {
//         // return size == rear + 1;
//         return size == arr.length;
//     }
//     public void append(int data) {
//     if(isFull()) {
//         System.out.println("Queue is Full !!!");
//         return;
//     }
//     size++;
//     // arr[++rear] = data;
//     rear++;
//     arr[rear] = data;
//     }
//     public void remove() {
//         if(isEmpty()) {
//             System.out.println("Queue is Empty");
//             return;
//         }
//         for(int i = 0; i < rear; i++) {
//             arr[i] = arr[i+1];
//         }
//         rear--;
//         size--;
//     }
//     public int peek() {
//         if (isEmpty()) {
//             return -1;
//         }
//         return arr[0];
//     }
//     public static void main(String[] args) {
//         Day8Queue q = new Day8Queue(5);
//         q.append(10);
//         q.append(20);
//         q.append(30);
//         q.append(40);
//         q.append(50);
//         q.append(60);
//         System.out.println();
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
public class Day8Queue {

    int[] arr;
    int size;
    int front;
    int rear;

    public Day8Queue(int n) {
        this.size = 0;
        this.arr = new int[n];
        this.rear = -1;
        this.front = -1;
    }

    public boolean isEmpty() {
        // return size == 0;
        return rear == -1 && front == -1;
        // return rear == -1;
    }

    public boolean isFull() {
        // return (rear + 1) % size == front;
        return size == arr.length;
    }

    public void append(int data) {

        if (isFull()) {
            System.out.println("Queue is Full !!!");
            return;
        }

        size++;
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            if (rear != arr.length - 1) {
                rear++;
            } else {
                rear = 0;
            }
        }
        arr[rear] = data;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if (size == 1) { // CHANGE MADE
            rear = -1;    // CHANGE MADE
            front = -1;    // Change MADE
        } else {
            front++;
        }
        size--;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    public static void main(String[] args) {
        Day8Queue q = new Day8Queue(5);

        q.append(20);
        q.remove();
        q.append(50);
        q.append(10);
        q.append(30);
        q.append(40);
        // System.out.println(q.peek());
        // q.append(60);
        // System.out.println("---");

        while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
        }
    }
}
