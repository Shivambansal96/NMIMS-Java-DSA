
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(55);
//         q.add(98);
//         System.out.println(q);
//         System.out.println(q.element());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.peek());
//     }
// }
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> q = new ArrayDeque<>();
//         q.offer(55);
//         q.offerFirst(2);
//         q.offerLast(100);
//         q.peek();
//         q.peekFirst();
//         q.peekLast();
//         q.poll();
//         q.pollFirst();
//         q.pollLast();
//         System.out.println(q);
//     }
// }
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> q = new PriorityQueue<>();
//         // PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
//         q.offer(55);
//         q.offer(100);
//         q.offer(1);
//         q.offer(8);
//         q.poll();
//         System.out.println(q);
//     }
// }
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         int[] arr = {5, 1, 10, 2, 8, 12, 3};
//         int k = 3;
//         for(int val: arr) {
//             pq.offer(val);
//             if(pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         System.out.println(pq);
//     }
// }
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//         int[] arr = {5, 1, 10, 2, 8, 12, 3};
//         int k = 3;
//         for (int val : arr) {
//             pq.offer(val);
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         System.out.println(pq);
//     }
// }
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         List<Integer> arrList = new ArrayList<>(Arrays.asList(45, 12, 23, 90));
//         Comparator<Integer> cmp = new Comparator<>() {
//             @Override
//             public int compare(Integer a, Integer b) {
//                 if (a % 10 > b % 10) {
//                     return 1;
//                 }else {
//                     return -1;
//                 }
//             }
//         };
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
//     }
// }
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         List<Integer> arrList = new ArrayList<>(Arrays.asList(45, 12, 23, 90));
//         Comparator<Integer> cmp = (Integer a, Integer b) -> {
//             if (a % 2 == 0) {
//                 return -1;
//             }else {
//                 return 1;
//             }
//         };
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
//     }
// }
// import java.util.*;
// class Student {
//     String name;
//     int age;  
//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }
//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Student{");
//         sb.append("name=").append(name);
//         sb.append(", age=").append(age);
//         sb.append('}');
//         return sb.toString();
//     }
// }
// public class Day3 {
//     public static void main(String[] args) {
//         List<Student> arrList = new ArrayList<>();
//         Comparator<Student> cmp = (Student a, Student b) -> {
//             if(a.age > b.age)
//                 return 1;
//             else
//                 return -1;
//         };
//         arrList.add(new Student(26, "Shivam"));
//         arrList.add(new Student(29, "Mohini"));
//         arrList.add(new Student(24, "Sejal"));
//         arrList.add(new Student(22, "Titheee"));
//         arrList.add(new Student(99999999, "Shiva"));
//         Collections.sort(arrList, cmp);
//         for(Student val: arrList)
//             System.out.println(val);
//     }
//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Day3{");
//         sb.append('}');
//         return sb.toString();
//     }
// }



public class Day3 {

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i];
            currentSum -= arr[i - k];

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println((float) maxSum / k);

    }
}
