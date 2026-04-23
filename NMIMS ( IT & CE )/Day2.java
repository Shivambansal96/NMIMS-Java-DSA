
// import java.util.HashSet;
// import java.util.Set;

// public class Day2 {

//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         // Set<Integer> set = new LinkedHashSet<>();
//         // Set<Integer> set = new TreeSet<>();

//         set.add(43);
//         set.add(51);
//         set.add(12);
//         set.add(99);
//         set.add(51);

//         System.out.println(set.contains(434));

//         set.remove(51);

//         System.out.println(set);

//         // System.out.println(set);
//     }
// }


// ! Check Duplicates (Method 1)
// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();

//         // int[] arr = {1, 4, 1, 4, 2, 6, 7, 9, 1}; // arrlength = 9
//         int[] arr = {1, 4};

//         for(int val : arr) {
//             set.add(val);
//         }

//         if (arr.length != set.size()) {
//             System.out.println(true);
//         }
//         else {
//             System.out.println(false);
//         }
//     }
// }



// ! Check Duplicates (Method 2)
// import java.util.*;

// public class Day2 {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         List<Integer> arrList = new ArrayList<>();

//         int[] arr = {1, 4, 1, 4, 2, 6, 7, 9, 1}; 
//         // int[] arr = {1, 4};

//         boolean flag = false;

//         for(int i = 0; i < arr.length; i++) {
//             if(set.contains(arr[i])) {
//                 arrList.add(arr[i]);
//                 flag = true;
//             }
//             set.add(arr[i]);
//         }

//         System.out.println(flag);
//         System.out.println("Duplicates = " + arrList);
//     }
// }

// ! Iterator
// import java.util.*;
// public class Day2 {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();

//         int[] arr = {43, 1, 56, 11, 87, 94};

//         for(int val: arr)
//             set.add(val);

//         Iterator<Integer> it = set.iterator();

//         while(it.hasNext())
//             System.out.print(it.next() + " ");

//     }
// }


// ! HashMap and in-built methods

// import java.util.*;

// public class Day2 {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();

//         map.put("Shivam", 99);
//         map.put("Sejal", 12);
//         map.put("Tithee",56);
//         map.putIfAbsent("Shiva",90);

//         System.out.println(map);

//         // System.out.println(map.containsKey("Shivam"));
//         // System.out.println(map.containsKey("Mohini"));

//         // System.out.println(map.containsValue(56));
//         // System.out.println(map.containsValue(100));

//         // System.out.println(map.get("Shivam"));
//         // System.out.println(map.get("Shiv"));


//         for (Map.Entry<String, Integer> e: map.entrySet()) {
//             System.out.print(e + ", ");
//         }

//     }
// }


// ! HashMap Duplicates appearing more than n/3 times.

import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = {1, 4, 1, 4, 2, 1, 7, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else 
                map.put(arr[i], 1);
        }

        System.out.println(map);



    }
}