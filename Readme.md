# ☕ Java DSA – NMIMS

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active%20Learning-success?style=for-the-badge)
![Students](https://img.shields.io/badge/NMIMS-Engineering%20Students-blue?style=for-the-badge)
![Batch](https://img.shields.io/badge/Batch-IT%20&%20CE%20(Batch%202)-red?style=for-the-badge)
![Progress](https://img.shields.io/badge/Day%201-Completed-brightgreen?style=for-the-badge)
![Training](https://img.shields.io/badge/Training-In%20Progress-success?style=for-the-badge)

### 🚀 *Master Data Structures & Algorithms with Java!*

**Welcome to your comprehensive DSA learning journey!**  
Everything you need to ace coding interviews and become a problem-solving expert.

[📚 Start Learning](#-topics-covered) • [💻 Problems Solved](#-problems-covered---day-1) • [🎯 What's Next](#-whats-coming-next)

---

</div>

## 🎯 Quick Navigation

<table>
<tr>
<td width="33%" align="center">

### 📦 **Collections**
Arrays, ArrayList, Lists

[Jump to Topics →](#-collections-framework)

</td>
<td width="33%" align="center">

### 🔢 **Arrays**
Manipulation & Problem Solving

[View Algorithms →](#-arrays--arraylist)

</td>
<td width="33%" align="center">

### 🏆 **Problems**
Practice Questions

[See Problems →](#-problems-covered---day-1)

</td>
</tr>
</table>

---

## 📊 Learning Progress

```
Day 1 - Collections & Arrays:
████████████████████████████████ 100%

✅ Arrays - Basics & Manipulation
✅ ArrayList - Dynamic Arrays
✅ Collections Framework Overview
✅ Lists - ArrayList, LinkedList
✅ Move Zeroes to End Problem
✅ Remove Duplicates Problem
✅ Practice Problems

Day 2 - Collections Advanced & Array Algorithms:
🔜 IN PROGRESS

✅ Sets (HashSet, LinkedHashSet, TreeSet)
✅ Map Interface (HashMap, TreeMap, LinkedHashMap)
✅ Queue Interface (PriorityQueue, Deque)
✅ Collections Utility Class
⏳ Sliding Window Technique
⏳ Prefix Sum Algorithm
⏳ Array Problem Solving
```

---

## 🗺️ Learning Path

```mermaid
graph LR
    A[📦 Arrays] --> B[📋 ArrayList]
    B --> C[🎯 Collections]
    C --> D[📚 Lists]
    D --> E[🗺️ Map]
    E --> F[📬 Queue]
    F --> G[🛠️ Collections Utils]
    G --> H[🪟 Sliding Window]
    H --> I[➕ Prefix Sum]
    I --> J[🔥 Problem Solving]
    
    style A fill:#90EE90
    style B fill:#90EE90
    style C fill:#90EE90
    style D fill:#90EE90
    style E fill:#FFD700
    style F fill:#FFD700
    style G fill:#FFD700
    style H fill:#87CEEB
    style I fill:#87CEEB
    style J fill:#FF6B6B
```

---

## 📚 Topics Covered

<details open>
<summary><h3>📦 Arrays & ArrayList</h3></summary>

> **Array:** Fixed-size collection of elements of the same type stored in contiguous memory locations.
> **ArrayList:** Dynamic array that grows automatically when needed.

### 1️⃣ **Arrays Basics**

#### 📊 Array Declaration & Initialization

```java
// Declaration
int[] arr;
int arr2[];
int[] arr3 = new int[5];

// Initialization with values
int[] numbers = {1, 2, 3, 4, 5};
String[] fruits = {"Apple", "Banana", "Mango"};

// Multi-dimensional arrays
int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

// Getting array size
int length = numbers.length;  // 5

// Accessing elements (0-indexed)
int first = numbers[0];   // 1
int last = numbers[4];    // 5
```

#### ⏱️ Time & Space Complexity

| Operation | Time | Space |
|:----------|:----:|:-----:|
| Access | O(1) | O(n) |
| Search | O(n) | — |
| Insert | O(n) | — |
| Delete | O(n) | — |

#### 🔧 Array Traversal Methods

```java
// Enhanced for loop
int[] arr = {10, 20, 30, 40, 50};

for (int val : arr) {
    System.out.println(val);
}

// Traditional for loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// While loop
int i = 0;
while (i < arr.length) {
    System.out.println(arr[i]);
    i++;
}
```

---

### 2️⃣ **ArrayList - Complete Guide**

> **ArrayList** is a resizable implementation of the List interface, part of the Collections Framework.

#### 📦 ArrayList Declaration & Creation

```java
// Basic declaration
ArrayList<Integer> list = new ArrayList<>();

// With initial capacity
ArrayList<Integer> list2 = new ArrayList<>(10);

// Different data types
ArrayList<String> names = new ArrayList<>();
ArrayList<Double> prices = new ArrayList<>();
ArrayList<Boolean> flags = new ArrayList<>();
```

#### ⚙️ ArrayList Operations

```java
ArrayList<Integer> numbers = new ArrayList<>();

// ADD - Insert elements at end | O(1) amortized
numbers.add(10);
numbers.add(20);
numbers.add(30);
// Output: [10, 20, 30]

// ADD AT INDEX - Insert at specific position | O(n)
numbers.add(1, 15);  // Insert 15 at index 1
// Output: [10, 15, 20, 30]

// GET - Retrieve element by index | O(1)
int element = numbers.get(2);  // 20

// SET - Modify element at index | O(1)
numbers.set(0, 5);
// Output: [5, 15, 20, 30]

// REMOVE - Delete element by index | O(n)
numbers.remove(2);
// Output: [5, 15, 30]

// REMOVE by value | O(n)
numbers.remove(Integer.valueOf(15));
// Output: [5, 30]

// SIZE - Get total elements | O(1)
int size = numbers.size();  // 2

// CHECK IF EMPTY | O(1)
boolean isEmpty = numbers.isEmpty();

// CONTAINS - Check if element exists | O(n)
boolean has10 = numbers.contains(10);  // true

// CLEAR - Remove all elements | O(n)
// numbers.clear();
```

#### 📊 Complete ArrayList Example

```java
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("After adding: " + numbers);
        // Output: After adding: [10, 20, 30]
        
        // Adding at index
        numbers.add(1, 15);
        System.out.println("After adding at index 1: " + numbers);
        // Output: After adding at index 1: [10, 15, 20, 30]
        
        // Getting element
        System.out.println("Element at index 2: " + numbers.get(2));
        // Output: Element at index 2: 20
        
        // Setting element
        numbers.set(0, 5);
        System.out.println("After setting index 0: " + numbers);
        // Output: After setting index 0: [5, 15, 20, 30]
        
        // Removing element
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers);
        // Output: After removing index 2: [5, 15, 30]
        
        // Size and isEmpty
        System.out.println("Size: " + numbers.size());
        System.out.println("Is empty: " + numbers.isEmpty());
        // Output: Size: 3, Is empty: false
    }
}
```

---

### 3️⃣ **ArrayList vs Array**

| Feature | Array | ArrayList |
|:--------|:-----:|:---------:|
| **Size** | Fixed | Dynamic |
| **Type** | Primitive/Object | Object only |
| **Performance** | Faster (fixed size) | Slower (resizable) |
| **Memory** | Exact | Extra buffer |
| **Type Safety** | Weak | Type-safe with Generics |
| **Flexibility** | Low | High |
| **Access** | O(1) | O(1) |
| **Insert/Delete** | O(n) | O(n) |

#### 📈 When to Use What?

**Use Array when:**
- ✅ Fixed size known in advance
- ✅ Maximum performance needed
- ✅ Working with primitives
- ✅ Memory is critical

**Use ArrayList when:**
- ✅ Size changes frequently
- ✅ Code flexibility needed
- ✅ Need dynamic growth
- ✅ Convenience > Performance

</details>

---

<details open>
<summary><h3>🎯 Collections Framework</h3></summary>

> **Collections Framework** provides unified architecture for representing and manipulating collections efficiently.

### 📊 Collections Hierarchy

```
Iterable (Interface)
    ↓
Collection (Interface)
    ├── List (Interface)
    │   ├── ArrayList ← Most used
    │   ├── LinkedList
    │   └── Vector (Legacy)
    ├── Set (Interface)
    │   ├── HashSet
    │   ├── LinkedHashSet
    │   ├── TreeSet
    │   └── EnumSet
    └── Queue (Interface)
        ├── PriorityQueue
        ├── Deque
        └── LinkedList (dual-purpose)

Map (Separate Interface)
    ├── HashMap ← Most used
    ├── LinkedHashMap
    ├── TreeMap
    ├── Hashtable (Legacy)
    └── WeakHashMap
```

---

</details>

<details open>
<summary><h3>📚 Lists Collection</h3></summary>

> **List** is an ordered collection that allows duplicates and index-based access.

### 1️⃣ **ArrayList** - Already Covered Above ✅

---

### 2️⃣ **LinkedList** - Linked Structure

```java
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // ADD operations
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After add: " + list);
        // Output: [Java, Python, C++]
        
        // ADD at specific index
        list.add(1, "JavaScript");
        System.out.println("After add at index 1: " + list);
        // Output: [Java, JavaScript, Python, C++]
        
        // FIRST and LAST elements
        System.out.println("First: " + list.getFirst());  // Java
        System.out.println("Last: " + list.getLast());    // C++
        
        // REMOVE operations
        list.removeFirst();  // Remove Java
        list.removeLast();   // Remove C++
        System.out.println("After removals: " + list);
        // Output: [JavaScript, Python]
        
        // ADD operations (queue-style)
        list.addFirst("HTML");
        list.addLast("SQL");
        System.out.println("After queue operations: " + list);
        // Output: [HTML, JavaScript, Python, SQL]
    }
}
```

**Characteristics:**
- ✅ Allows duplicates
- ✅ Maintains insertion order
- ✅ Linked structure (nodes with pointers)
- ✅ O(n) random access, O(1) add/remove at ends
- ✅ More memory (pointers) per element

---

### 📊 ArrayList vs LinkedList

| Operation | ArrayList | LinkedList |
|:----------|:---------:|:----------:|
| **Access (get)** | O(1) | O(n) |
| **Add (end)** | O(1) amortized | O(1) |
| **Add (middle)** | O(n) | O(n) |
| **Remove** | O(n) | O(n) |
| **Memory** | Less | More (pointers) |
| **Cache** | Better | Worse |
| **Best For** | Search | Queue/Stack |

</details>

---

<details open>
<summary><h3>💾 Array Problem Solving - Move Zeroes</h3></summary>

> **Problem:** Move all zeros to the end of the array while maintaining the relative order of non-zero elements.

### 🎯 Approach: Two Pointers

The two-pointer technique uses one pointer to mark the position for the next non-zero element.

#### 🔧 Implementation

```java
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 4, 0, 9};
        
        moveZeroes(arr);
        
        // Print result
        for (int val : arr) {
            System.out.print(val + " ");
        }
        // Output: 4 9 0 0
    }
    
    public static void moveZeroes(int[] arr) {
        /*
        Two-pointer approach:
        - j tracks position for next non-zero element
        - i traverses the entire array
        - When we find non-zero, swap with position j
        
        Time Complexity: O(n) - single pass
        Space Complexity: O(1) - in-place operation
        */
        
        int j = 0;  // Position for next non-zero element
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Found a non-zero element
                // Swap it to position j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
```

#### 🎯 Dry Run Example: `{0, 4, 0, 9}`

```
Initial: arr = [0, 4, 0, 9], j = 0

i=0: arr[0]=0 → Skip (is zero)

i=1: arr[1]=4 → Not zero
     Swap arr[1] and arr[0]
     arr = [4, 0, 0, 9]
     j = 1

i=2: arr[2]=0 → Skip (is zero)

i=3: arr[3]=9 → Not zero
     Swap arr[3] and arr[1]
     arr = [4, 9, 0, 0]
     j = 2

Final Result: [4, 9, 0, 0] ✅
```

#### 📊 Visualization

```
Step 1: [0, 4, 0, 9]  (j=0, i=0: skip zero)
        ↑
        j
        
Step 2: [4, 0, 0, 9]  (i=1: found 4, swap)
           ↑
           j
           
Step 3: [4, 0, 0, 9]  (j=1, i=2: skip zero)
           ↑
           j
           
Step 4: [4, 9, 0, 0]  (i=3: found 9, swap)
              ↑
              j
              
Final: [4, 9, 0, 0] ✅
```

#### ⏱️ Complexity Analysis

- **Time Complexity:** O(n)
  - Single pass through array
  - Each element visited once
  
- **Space Complexity:** O(1)
  - No extra space used
  - In-place swapping
  
- **Why this works:**
  - When arr[i] ≠ 0, we move it forward
  - Position j always marks the next available spot for non-zero
  - By the end, all non-zeros are before all zeros

#### 🔄 More Examples

```java
// Example 1: All zeros
Input: [0, 0, 0]
Output: [0, 0, 0]

// Example 2: No zeros
Input: [1, 2, 3]
Output: [1, 2, 3]

// Example 3: Mixed
Input: [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]

// Example 4: Zeros at end
Input: [1, 2, 3, 0, 0]
Output: [1, 2, 3, 0, 0]
```

</details>

---

<details open>
<summary><h3>💾 Removing Duplicates - Complete Solution</h3></summary>

> **Problem:** Remove all duplicate elements from an ArrayList while preserving elements.

### ❌ Approach 1: Brute Force (O(n²))

```java
public class RemoveDuplicatesBruteForce {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] input = {1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13};
        
        for (int val : input) {
            arr.add(val);
        }
        
        // Compare each element with all elements after it
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                // If duplicate found, remove it
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--;  // Adjust index after removal
                }
            }
        }
        
        System.out.println("Result: " + arr);
        // Output: [1, 4, 3, 133, 345, 13]
    }
}
```

**Dry Run Example:**

```
Initial: [1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13]
         
i=0 (val=1): j=2 finds duplicate 1 → remove
             [1, 4, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13]
             j=2 finds duplicate 1 → remove
             [1, 4, 1, 1, 1, 4, 3, 133, 345, 13, 13]
             ... continue until no more 1s at end

i=1 (val=4): j=6 finds duplicate 4 → remove
             [1, 4, 1, 1, 1, 3, 133, 345, 13, 13]

... continue for all elements

Final: [1, 4, 3, 133, 345, 13]
```

**Complexity Analysis:**
- ⏱️ **Time:** O(n²) - nested loops
- 💾 **Space:** O(1) - no extra space
- ✅ **Pros:** Simple, in-place
- ❌ **Cons:** Slow for large lists

---

### ⚡ Approach 2: Using HashSet Constructor (O(n))

```java
public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] input = {1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13};
        
        for (int val : input) {
            arr.add(val);
        }
        
        // Convert ArrayList to HashSet and back
        // HashSet automatically removes duplicates
        ArrayList<Integer> result = new ArrayList<>(new HashSet<>(arr));
        
        System.out.println("Result: " + result);
        // Output: [1, 4, 3, 133, 345, 13]
    }
}
```

**How it works:**
```
1. new HashSet<>(arr)      → Converts ArrayList to HashSet
                             → Automatically removes duplicates
                             
2. new ArrayList<>(...)     → Converts back to ArrayList
```

**Complexity Analysis:**
- ⏱️ **Time:** O(n)
- 💾 **Space:** O(n)
- ✅ **Pros:** Concise, fast
- ❌ **Cons:** Order not guaranteed, extra space

---

### 🎯 Complete Solution Comparison

```java
import java.util.*;

public class RemoveDuplicates {
    
    // Method 1: Brute Force (O(n²) time, O(1) space)
    public static ArrayList<Integer> removeDuplicatesBruteForce(int[] input) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int val : input) arr.add(val);
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        return arr;
    }
    
    // Method 2: Using HashSet Constructor (O(n) time, O(n) space) - RECOMMENDED
    public static ArrayList<Integer> removeDuplicatesHashSet(int[] input) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int val : input) arr.add(val);
        
        return new ArrayList<>(new HashSet<>(arr));
    }
    
    public static void main(String[] args) {
        int[] input = {1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13};
        
        System.out.println("Original: " + Arrays.toString(input));
        System.out.println("Brute Force: " + removeDuplicatesBruteForce(input));
        System.out.println("HashSet: " + removeDuplicatesHashSet(input));
        
        // Output:
        // Original: [1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13]
        // Brute Force: [1, 4, 3, 133, 345, 13]
        // HashSet: [1, 4, 3, 133, 345, 13]
    }
}
```

#### 📊 Approach Comparison

| Aspect | Brute Force | HashSet |
|:-------|:-----------:|:-------:|
| **Time** | O(n²) | O(n) |
| **Space** | O(1) | O(n) |
| **Speed** | Slow | Fast ⭐ |
| **Order Preserved** | ✅ Yes | ❌ No |
| **Code Simplicity** | Simple | Simpler ⭐ |
| **Use Case** | Learning | Production |

</details>

---

## ✅ Problems Covered - Day 1

### 📋 **Collections & Arrays**

| # | Problem | Difficulty | Concept | Status |
|:-:|:--------|:----------:|:--------|:------:|
| 1 | Array Input/Output | 🟢 Easy | Array Basics | ✅ |
| 2 | ArrayList Operations | 🟢 Easy | ArrayList Methods | ✅ |
| 3 | Move Zeroes to End | 🟡 Medium | Two Pointers | ✅ |
| 4 | Remove Duplicates (Brute Force) | 🟡 Medium | Nested Loops | ✅ |
| 5 | Remove Duplicates (HashSet) | 🟡 Medium | Collections | ✅ |
| 6 | ArrayList Iteration Methods | 🟢 Easy | Collections | ✅ |

---

## 📅 What's Coming Next?

### 🔜 Day 2: Collections Advanced & Array Algorithms

```
✅ WILL COVER:
├── 🏷️ Sets Interface
│   ├── HashSet - Unordered unique
│   ├── LinkedHashSet - Insertion order
│   └── TreeSet - Sorted unique
│
├── 🗺️ Map Interface
│   ├── HashMap - Key-value pairs
│   ├── TreeMap - Sorted keys
│   └── LinkedHashMap - Order preserved
│
├── 📬 Queue Interface
│   ├── PriorityQueue - Min/Max heap
│   ├── Deque - Double-ended queue
│   └── ArrayDeque - Efficient implementation
│
├── 🛠️ Collections Utility Class
│   ├── sort(), reverse(), shuffle()
│   ├── min(), max()
│   ├── binarySearch()
│   └── frequency()
│
└── 🔥 Array Problem-Solving Techniques
    ├── 🪟 Sliding Window
    │   ├── Maximum sum subarray
    │   ├── Longest substring
    │   └── Container with most water
    │
    └── ➕ Prefix Sum
        ├── Range sum queries
        ├── Subarray sum equals K
        └── Product of array except self
```

---

## 📚 Quick Reference

### 🎓 Key Concepts to Remember

```
DAY 1 SUMMARY:

1. ARRAYS:
   - Fixed size, indexed access O(1)
   - Use for: fixed-size collections
   - Enhanced for loop: for(int x : arr)

2. ARRAYLIST:
   - Dynamic size, indexed access O(1)
   - Common methods: add(), get(), remove(), set()
   - Use for: flexible collections

3. COLLECTIONS:
   - List: ordered with duplicates
   - Queue: FIFO processing
   - Map: key-value pairs
   - Set: unordered, no duplicates (coming Day 2)

4. LISTS:
   - ArrayList: random access O(1), add/remove O(n)
   - LinkedList: fast add/remove O(1) at ends

5. PROBLEM-SOLVING:
   - Move Zeroes: Two Pointers technique O(n)
   - Brute Force: O(n²) time, O(1) space
   - HashSet: O(n) time, O(n) space - RECOMMENDED
```

---

## 🔗 Collections Class Methods (Coming Day 2)

```java
import java.util.Collections;

// Will learn:
Collections.sort(list);           // Sort list
Collections.reverse(list);        // Reverse list
Collections.shuffle(list);        // Randomize
Collections.min(list);            // Minimum element
Collections.max(list);            // Maximum element
Collections.frequency(list, x);   // Count occurrences
Collections.binarySearch(list, x); // Binary search
Collections.fill(list, value);    // Fill with value
Collections.copy(dest, src);      // Copy list
```

---

## 💻 Code Structure Best Practices

```java
// Good practice: Use appropriate collections

// ✅ When you need index access and frequent lookup
ArrayList<String> names = new ArrayList<>();

// ✅ When you need FIFO behavior
Queue<Integer> tasks = new LinkedList<>();

// ✅ When you need key-value mapping
Map<String, Integer> ageCounts = new HashMap<>();

// ✅ When you need list-like with fast add/remove
LinkedList<String> commands = new LinkedList<>();
```

---

## 🎯 Learning Tips

<table>
<tr>
<td>

### 📖 Study Tips
1. **Code along** - Type every example yourself
2. **Dry run** - Manually trace through code
3. **Experiment** - Modify code and observe changes
4. **Understand** - Know WHY before memorizing

</td>
<td>

### 💪 Practice Tips
5. **Solve variations** - Try different inputs
6. **Compare approaches** - Brute force vs optimal
7. **Analyze complexity** - Time and space always
8. **Build intuition** - Practice similar problems

</td>
</tr>
</table>

---

## 📊 Progress Tracking

```
✅ Completed (Day 1):
  - Arrays basics and manipulation
  - ArrayList all operations
  - Lists (ArrayList, LinkedList)
  - Move Zeroes to End (Two Pointers)
  - Duplicate removal (multiple approaches)

🔜 Next (Day 2):
  - Sets (HashSet, LinkedHashSet, TreeSet)
  - Map interface (HashMap, TreeMap, LinkedHashMap)
  - Queue interface
  - Collections utility class
  - Sliding window technique
  - Prefix sum algorithm

📈 Overall Progress: 1/10 days completed (10%)
```

---

## 🏆 Performance Cheat Sheet

### Collections Time Complexity

```
                Access    Add    Remove   Contains
ArrayList       O(1)     O(n)    O(n)     O(n)
LinkedList      O(n)     O(1)    O(1)     O(n)
HashMap         —        O(1)    O(1)     O(1)
TreeMap         —        O(log n) O(log n) O(log n)
PriorityQueue   O(n)     O(log n) O(log n) O(n)
```

---

## 🎓 Resources & References

<table>
<tr>
<td>

### 📚 Documentation
- [Java Collections](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html)
- [ArrayList Docs](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)
- [List Interface](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html)

</td>
<td>

### 🛠️ Practice Platforms
- [LeetCode](https://leetcode.com/) - Problem solving
- [HackerRank](https://www.hackerrank.com/) - Java practice
- [GeeksforGeeks](https://www.geeksforgeeks.org/) - Tutorials

</td>
</tr>
</table>

---

## 🤝 Questions & Solutions

### Q1: When should I use ArrayList over Array?
**A:** Use ArrayList when:
- Size is not known beforehand
- Frequent insertions/deletions needed
- Need dynamic growth
- Flexibility is more important than performance

Use Array when:
- Size is fixed and known
- Maximum performance needed
- Working with primitives extensively
- Memory constraints

---

### Q2: Why does the Two Pointers approach work for Move Zeroes?
**A:** Because:
- We maintain pointer j for next non-zero position
- When we find a non-zero at i, we swap it to position j
- This puts all non-zeros before all zeros in a single pass
- Time: O(n), Space: O(1) - optimal solution!

---

### Q3: Why is HashSet better than nested loops for duplicates?
**A:** 
- HashSet lookup: O(1) average
- Brute force: checks each element against all others → O(n²)
- Trade-off: HashSet uses O(n) extra space
- For most cases, HashSet is worth the trade-off

---

## 📝 Important Code Snippets

### Import Statements You'll Need

```java
// Collections Framework
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Queue;
import java.util.Collections;
import java.util.Arrays;

// Or import all
import java.util.*;
```

---

## 🚀 Next Steps

1. **Review** - Re-read Day 1 materials
2. **Practice** - Solve ArrayList problems on LeetCode
3. **Experiment** - Modify examples and see what breaks
4. **Prepare** - Get ready for Day 2 (Sets, Maps, Queues)
5. **Ask** - Clarify any doubts before moving forward

---

## 🎯 Day 1 Code Summary

```java
// ========== ARRAYS ==========
int[] arr = {0, 4, 0, 9};
int j = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
    }
}
// Result: [4, 9, 0, 0]

// ========== ARRAYLIST OPERATIONS ==========
ArrayList<Integer> arrList = new ArrayList<>();
arrList.add(2);
arrList.add(1);
arrList.add(3);
arrList.add(4, 54);
arrList.set(0, 5);
arrList.remove(2);

// ========== REMOVE DUPLICATES ==========
ArrayList<Integer> arrList = new ArrayList<>();
int[] arr = {1, 4, 1, 1, 1, 1, 1, 4, 3, 133, 345, 13, 13};
for (int val: arr)
    arrList.add(val);

for (int i = 0; i < arrList.size(); i++) {
    for (int j = i + 1; j < arrList.size(); j++) {
        if(arrList.get(i).equals(arrList.get(j))){
            arrList.remove(j);
            j--;
        }
    }
}
System.out.println(arrList);
// Output: [1, 4, 3, 133, 345, 13]
```

<br>

---

<div align="center">

### 🌟 Keep Coding, Keep Growing! 🌟

---

### ✨ Remember: *Consistency > Intensity* ✨

Code every day, solve problems regularly, and success will follow!

---

<div align="center">

### ✨ Created By ✨

## <a href="https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19" target="_blank">✨ **Shine_Beyond_Syntax** ✨</a>

<br>

[![WhatsApp Channel](https://img.shields.io/badge/Join%20My-WhatsApp%20Channel-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19)

<br>

</div>


![Java](https://img.shields.io/badge/Built%20with-Java-blue?style=flat-square&logo=java)
![DSA](https://img.shields.io/badge/Learning-DSA-orange?style=flat-square)
![NMIMS](https://img.shields.io/badge/NMIMS%20Engineering-Excellence-green?style=flat-square)

</div>