//Collections: Dynamic size, predefined data structures, Collections.sort(), add(), remove(), contains(),size()

// Common Collections in Java:

// List Interface (Ordered, Duplicates Allowed)
  // - ArrayList (less memory, not synchronized, best for frequent retrieval)
  // - LinkedList (uses doubly linked list, good for frequent insertions/removals)
  // - Vector (more memory, synchronized, thread-safe but slower)

// Set Interface (No Duplicates)
  // - HashSet (unordered)
  // - TreeSet (sorted in ascending order)
  // - LinkedHashSet (insertion order maintained)

// Queue Interface (FIFO Ordering)
  // - PriorityQueue (sorted based on priority, natural order by default)
  // - ArrayDeque (double-ended queue, faster than Stack)
  // - LinkedList (can also be used as a queue)

// Stack (LIFO Ordering)
  // - Stack (Legacy class, thread-safe but slower)
  // - ArrayDeque (recommended alternative to Stack, faster and more efficient)

// Map Interface (Key-Value Pairs, Keys must be unique)
  // - HashMap (unordered)
  // - TreeMap (sorted by key)
  // - LinkedHashMap (insertion order maintained)


package Collections;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Using an ArrayList (List Implementation)
        List<String> names = new ArrayList<>();
        names.add("Una");
        names.add("Shreya");
        names.add("Rohit");
        
        System.out.println("Names: " + names);  // Output: [Una, Shreya, Rohit]
        
        // Using a HashSet (Set Implementation)
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);  // Duplicate won't be added
        
        System.out.println("Numbers: " + numbers);  // Output: [10, 20] (order not guaranteed)
        
        
        Set<Integer> numbers1 = new TreeSet<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(10);  // Duplicate won't be added
        
        System.out.println("Numbers: " + numbers1);  
        
        Set<Integer> numbers2 = new LinkedHashSet<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(10);  // Duplicate won't be added
        
        System.out.println("Numbers: " + numbers2);  // Output: [10, 20] (order not guaranteed)
        

        
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Una");
        studentMap.put(2, "Shreya");

        System.out.println("HashMap Output: " + studentMap);  // Order is not guaranteed
        System.out.println("Student with ID 1: " + studentMap.get(1));  // Output: Una
        
        Map<Integer, String> studentMap1 = new TreeMap<>();
        studentMap1.put(2, "Shreya");
        studentMap1.put(1, "Una");  // Order will be sorted based on keys
        
        System.out.println("TreeMap Output: " + studentMap1);  // Output: {1=Una, 2=Shreya}
        System.out.println("Student with ID 1: " + studentMap1.get(1));  
        
        Map<Integer, String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(1, "Una");
        studentMap2.put(2, "Shreya");

        System.out.println("LinkedHashMap Output: " + studentMap2);  // Output: {1=Una, 2=Shreya}
        System.out.println("Student with ID 1: " + studentMap2.get(1));  
        
        // ====================== PRIORITY QUEUE IMPLEMENTATION ======================
        // PriorityQueue stores elements in natural order (smallest element first)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        System.out.println("\nPriority Queue: " + priorityQueue);  // Order may not be visible
        System.out.println("Removed from PriorityQueue: " + priorityQueue.poll());  // Removes the smallest element (10)
        System.out.println("PriorityQueue after poll: " + priorityQueue);  
        
     // ====================== QUEUE IMPLEMENTATION ======================
        // Queue follows FIFO (First-In-First-Out) ordering
        Queue<String> queue = new LinkedList<>();
        queue.add("Una");      // Enqueue
        queue.add("Shreya");
        queue.add("Rohit");

        System.out.println("\nQueue: " + queue);  // Output: [Una, Shreya, Rohit]

        System.out.println("Dequeued from queue: " + queue.poll());  // Removes "Una"
        System.out.println("Queue after poll: " + queue);  // Output: [Shreya, Rohit]

        System.out.println("Front element in queue: " + queue.peek());  // Output: Shreya
        System.out.println("Is queue empty? " + queue.isEmpty());  // false
        
        
        // ====================== STACK IMPLEMENTATION ======================
        // Stack follows LIFO (Last-In-First-Out) ordering
        Stack<String> stack = new Stack<>();
        stack.push("Una");      // Push element onto stack
        stack.push("Shreya");
        stack.push("Rohit");

        System.out.println("Stack: " + stack);  // Output: [Una, Shreya, Rohit]
        
        System.out.println("Popped from stack: " + stack.pop());  // Removes "Rohit"
        System.out.println("Stack after pop: " + stack);  // Output: [Una, Shreya]

        System.out.println("Top element in stack: " + stack.peek());  // Output: Shreya
        System.out.println("Is stack empty? " + stack.isEmpty());  // false
        
    }
}
