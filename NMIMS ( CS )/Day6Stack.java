



// public class Day6Stack {

//     Node head;

//     class Node {

//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     public boolean isEmpty() {
//         return head == null;
//     }

//     public void push(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;

//         System.out.println(newNode.data + " has been pushed to the stack!");

//     }

//     public int pop() {
//         if (isEmpty()) {
//             return -1;
//         }

//         int temp = head.data;
//         head = head.next;
//         return temp;
//     }

//     public int peek() {
//         if (isEmpty()) {
//             return -1;
//         }

//         return head.data;
//     }

//     public void printStack() {
//         Node currentNode = head;

//         while (currentNode != null) {
//             System.out.println("| " + currentNode.data + " |");
//             System.out.println("|---|");
//             currentNode = currentNode.next;
//         }
//     }

//     public static void main(String[] args) {

//         Day6Stack stk = new Day6Stack();

//         stk.push(1);
//         stk.push(2);
//         stk.push(3);
//         stk.push(4);
//         stk.printStack();

//         stk.pop();

//         System.out.println();

//         stk.printStack();

//     }

// }



// public class Day6Stack {

//     ArrayList<Integer> stk = new ArrayList<>();

//     public boolean isEmpty() {
//         return stk.size() == 0;
//     }

//     public void push(int data) {

//         stk.add(data);
        
//         System.out.println(data + " has been pushed to the stack!");

//     }

//     public int pop() {
//         if (isEmpty()) {
//             return -1;
//         }

//         int temp = stk.get(stk.size()-1);
//         System.out.println(temp + " has been popped from the stack!");
//         stk.remove(stk.size()-1);
//         return temp;


//     }

//     public int peek() {
//         if (isEmpty()) {
//             return -1;
//         }

//         return stk.get(stk.size()-1);
//     }

//     public void printStack() {

//         for(int i = stk.size() - 1; i >= 0; i--) {
//             System.out.println("| " + stk.get(i) + " |");
//             System.out.println("|---|");

//         }
//     }

//     public static void main(String[] args) {

//         Day6Stack stk = new Day6Stack();

//         stk.push(1);
//         stk.push(2);
//         stk.push(3);
//         stk.push(4);
//         stk.printStack();

//         stk.pop();

//         System.out.println();

//         stk.printStack();

//     }

// }


// import java.util.*;

// public class Day6Stack {
//     public static void main(String[] args) {
//         Stack<Integer> stk = new Stack<>();

//         stk.push(1);
//         stk.push(2);
//         stk.push(3);
//         stk.push(4);
//         System.out.println(stk);

//         stk.pop();

//         System.out.println(stk);

//         System.out.println(stk.peek());


//     }
// }


// public class Day6Stack {
//     int[] stack;
//     int top;
//     int capacity;

//     // Constructor
//     public Day6Stack(int size) {
//         stack = new int[size];
//         capacity = size;
//         top = -1;
//     }

//     // Push operation
//     public void push(int value) {
//         if (isFull()) {
//             System.out.println("Stack Overflow");
//             return;
//         }
//         stack[++top] = value;
//         System.out.println(value + " pushed to stack");
//     }

//     // Pop operation
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }
//         return stack[top--];
//     }

//     // Peek operation
//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return stack[top];
//     }

//     // Check if empty
//     public boolean isEmpty() {
//         return top == -1;
//     }

//     // Check if full
//     public boolean isFull() {
//         return top == capacity - 1;
//     }


//     public static void main(String[] args) {
//         Day6Stack stack = new Day6Stack(5);

//         stack.push(10);
//         stack.push(20);
//         stack.push(30);

//         System.out.println("Top element: " + stack.peek());

//         System.out.println("Popped: " + stack.pop());
//         System.out.println("Popped: " + stack.pop());

//         System.out.println("Is stack empty? " + stack.isEmpty());
//     }
// }


// import java.util.Stack;

// public class Day6Stack {

//     public static boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char ch : s.toCharArray()) {

//             // Push opening brackets
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             } 
//             // Handle closing brackets
//             else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }

//                 char top = stack.pop();

//                 if ((ch == ')' && top != '(') ||
//                     (ch == '}' && top != '{') ||
//                     (ch == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }

//         // Stack should be empty for valid parentheses
//         return stack.isEmpty();
//     }

//     public static void main(String[] args) {
//         String test1 = "{[()]}";
//         String test2 = "{[(])}";

//         System.out.println(test1 + " -> " + isValid(test1)); // true
//         System.out.println(test2 + " -> " + isValid(test2)); // false
//     }
// }