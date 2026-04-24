// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         // Set<Integer> set = new HashSet<>();
//         // Set<Integer> set = new LinkedHashSet<>();
//         Set<Integer> set = new TreeSet<>();
//         int[] arr = {12, 54, 1, 99};
//         for (int val : arr) {
//             set.add(val);
//         }
//         System.out.println(set);
//     }
// }
// ! Contains Duplicates and prints the value.
// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         List<Integer> arrList = new ArrayList<>();
//         int[] arr = {1, 12, 54, 1, 99, 1, 12};
//         boolean flag = false;
//         for(int i = 0; i < arr.length; i++) {
//             if(set.contains(arr[i])) {
//                 flag = true;
//                 arrList.add(arr[i]);
//             }
//             set.add(arr[i]);
//         }
//         System.out.println(flag);
//         System.out.println(arrList);
//     }
// }
// ! Iterator
// import java.util.*;
// public class Day2{
//     public static void main(String[] args) {
//         Set<Integer>set = new HashSet<>();
//         int[] arr = {42, 678, 2, 4};
//         for(int val: arr)
//             set.add(val);
//         Iterator<Integer> it = set.iterator();
//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }
//     }
// }
// ! HashMap 
// import java.util.*;
// public class Day2{
//     public static void main(String[] args) {
//         Map<String, Integer> map = new HashMap<>();
//         map.put("Shivam", 99);
//         map.put("Sejal", 120);
//         map.put("Tithee", 24);
//         map.putIfAbsent("Tithee", 90);
//         System.out.println(map);
//         // System.out.println(map.containsKey("Shivam"));
//         // System.out.println(map.containsKey("Mohini"));
//         // System.out.println(map.containsValue(99));
//         // System.out.println(map.containsValue(1200));
//         System.out.println(map.get("Shiva"));
//         // for(Map.Entry<String, Integer> e: map.entrySet()) {
//         //     System.out.print(e);
//         // }
//         for(String e: map.keySet())
//             System.out.println(e);
//         for(int e: map.values())
//             System.out.println(e);
//     }
// }
// ! Contains Duplicate more than n/3 times;
// import java.util.*;
// public class Day2{
//     public static void main(String[] args) {
//         Map<Integer, Integer> map = new HashMap<>();
//         List<Integer> arrList = new ArrayList<>();
//         int[] arr = {1, 4, 1, 4, 2, 1, 7, 9, 1};
//         int n = arr.length;
//         for (int i = 0; i < arr.length; i++) {
//             if (map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//             }
//             else {
//                 map.put(arr[i], 1);
//             }
//         }
//         System.out.println(map);
//         for(Map.Entry<Integer, Integer> e: map.entrySet()) {
//             if (e.getValue() > n/3) {
//                 arrList.add(e.getKey());
//             }
//         }
//         System.out.println(arrList);
//     }
// }

// ! ArrayDeque
// import java.util.ArrayDeque;
// public class Day2 {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> adq = new ArrayDeque<>();
//         adq.offer(43);
//         adq.offerFirst(1);
//         adq.offerLast(99);
//         adq.poll();
//         adq.pollFirst();
//         adq.pollLast();
//         System.out.println(adq);
//         System.out.println(adq.peek());
//         System.out.println(adq.peekFirst());
//         System.out.println(adq.peekLast());
//     }
// }
// ! PriorityQueue
// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pdq = new PriorityQueue<>();
//         pdq.add(43);
//         pdq.poll();
//         pdq.poll();
//         System.out.println(pdq);
//     }
// }
// ! kth Largest element using PriorityQueue
// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         int[] arr = {5, 1, 10, 3, 12, 2, 8};
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
// ! kth Smallest element using PriorityQueue
// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//         int[] arr = {5, 1, 10, 3, 12, 2, 8};
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
// ! Comparators 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day2 {

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(43, 11, 56, 99, 20));

        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            if (a % 10 > b % 10) {
                return 1;
            } else {
                return -1;
            }
        };

        // ! Lambda expression
        // Comparator<Integer> cmp1 = (Integer a, Integer b) -> {
        //     if(a%10 > b%10)
        //         return 1;
        //     else
        //         return -1;
        // };
        Collections.sort(arrList, cmp);
        System.out.println(arrList);

    }
}
