//What is Collection in Java?
//
//Collection = A group of objects stored together.
//It is a part of the Java Collection Framework (JCF).
//
//Think of it like:
//✔ A dynamic array
//✔ That grows and shrinks automatically
//✔ And provides built-in methods to add, remove, search, sort, etc.
//
//✅ Why Collections? (Need)
//
//Before collections → We used arrays, but arrays have limitations:
//
//Arrays Limitation	Collection Advantage
//Fixed size	Dynamic size (auto grow)
//Can store only same data type	Collections can store different objects
//Hard to add/remove elements	Very easy in collections
//No built-in sorting/search	Collections utility methods available
//🚀 Java Collection Framework (JCF)
//
//The collection framework contains:
//
//✔ Interfaces (rules)
//✔ Classes (implementation)
//✔ Algorithms (sort, search, etc.)
//
//🧩 Main Interfaces in Collection Framework
//1) List → Ordered, allows duplicates
//
//Maintains index (0,1,2...).
//
//Common Implementations:
//
//ArrayList → Fast for reading
//
//LinkedList → Fast for insertion/deletion
//
//Vector → Synchronized (thread-safe)
//
//Example:
//
//List<String> list = new ArrayList<>();
//list.add("A");
//list.add("B");
//list.add("A");
//System.out.println(list);
//
//2) Set → No duplicates, no indexing
//Common Implementations:
//
//HashSet → Random order
//
//LinkedHashSet → Maintains insertion order
//
//TreeSet → Sorted order (ascending)
//
//Example:
//
//Set<Integer> set = new HashSet<>();
//set.add(10);
//set.add(20);
//set.add(10); // duplicate not added
//System.out.println(set);
//
//3) Queue → Follows FIFO (First In First Out)
//Common Implementations:
//
//PriorityQueue → Elements automatically ordered
//
//ArrayDeque → Fast queue operations
//
//Example:
//
//Queue<Integer> q = new LinkedList<>();
//q.add(1);
//q.add(2);
//System.out.println(q.remove()); // 1
//
//4) Map (NOT part of Collection interface) → Stores key-value pairs
//
//Each key is unique.
//
//Common Implementations:
//
//HashMap → Fast, random order
//
//LinkedHashMap → Preserves insertion order
//
//TreeMap → Sorted by key
//
//Example:
//
//Map<Integer, String> map = new HashMap<>();
//map.put(1, "A");
//map.put(2, "B");
//map.put(1, "C"); // replaces old value
//System.out.println(map);
//
//🧰 Utility Class: Collections
//
//Java provides helper methods:
//
//Collections.sort(list);
//Collections.reverse(list);
//Collections.max(list);
//Collections.min(list);
