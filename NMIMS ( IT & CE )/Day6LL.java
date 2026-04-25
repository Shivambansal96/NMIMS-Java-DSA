
public class Day6LL {
    
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            // newNode.data = data;
            next = null;
        }
     // Node Class ENDS
    }
     // LinkedList Class ENDS

    public void prepend(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void append(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void DeleteStart() {
        if (head == null) {
            System.out.println("List is Empty !!!");
            return;
        }

        head = head.next;

    }

    public void DeleteEnd() {
        if(head == null) {
            System.out.println("List is Empty !!!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        } 

        Node currentNode = head;

        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;
    }

    public void printList() {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Day6LL list = new Day6LL();

        list.append(38);
        list.prepend(40);
        list.append(4);
        list.prepend(33);


        list.printList();

        list.DeleteStart();
        list.printList();

        list.DeleteEnd();
        list.printList();


    }
}
