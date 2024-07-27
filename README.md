## List 
## A} ArrayList
1. Dynamic array/  resizable-arrays
2. The order of elements is preserved as Insertion order.
3. You can add null elements.
4. Allows duplicate values.

## B} LinkedList 
1. Doubly Linked List.
2. The order of elements is preserved as Insertion order.
3. Allows Duplicates and Null values.

## C} Vector 
1. Dynamics array like ArrayList.
2. It is synchronized - Use in a Multi-threaded environment.

## D} Stack
1. Follows Last In, First Out (LIFO) principle.
2. It can be implemented using Arrays or Linked Lists.

## Queue
## A}PriorityQueue
1. Follows First In, First Out (FIFO) principle.
2. The order of elements as priority.
3. Can Implement Min/Max Heap, Balanced Binary Search Tree, and Sorted List.
4. PriorityQueue doesn't allow null values to be stored in the queue.
5. Allows duplicate Elements.

## B} Dequeue 
1. Double-ended queue (deque) that is implemented using an array.
2. Efficiency, Dynamic Array, Double-Ended.
3. Sliding Window Problems, Task Scheduling, Palindrome Checking.
4. The ArrayDeque class does not allow null values.
5. Allows duplicate Elements.

## Set
## A} HashSet
1. Hashing: Uses a hash table for storage. Hashing allows for average constant-time complexity.
2. O(1) for basic operations such as add, remove, and contains, assuming a good hash function and proper load factor.
3. No Duplicates: Does not allow duplicate elements. If you attempt to add an existing element, the set will remain unchanged.
4. Unordered: Does not maintain the order of elements. The order of elements in a HashSet is not guaranteed and can change when elements are added or removed.
5. Null Elements: Allows a single null element, which can vary based on implementation.

## B} LinkedHashSet
1. The LinkedHashSet class represents the LinkedList implementation of the Set Interface.
2. It extends the HashSet class and implements the Set interface.
3. Like HashSet, It also contains unique elements.
4. It maintains the insertion order and permits null elements.

## C} TreeSet
1. Java TreeSet class implements the Set interface that uses a tree for storage.
2. Like HashSet, TreeSet also contains unique elements.
3. However, the access and retrieval time of TreeSet is quite fast.
4. The elements in TreeSet are stored in ascending order.

## Map
## A} HashMap
1. It stores the data in (Key, Value) pairs.
2. To access a value one must know its key.
3. This class uses a technique called Hashing.
4. Null Keys and Values: Allows one null key and multiple null values. However, the handling of null can vary in different implementations or languages.
5. Thread Safety: HashMap is not synchronized. If you need a thread-safe implementation, consider ConcurrentHashMap or use Collections.
   
## B} LinkedHashMap
1. A LinkedHashMap contains values based on the key. It implements the Map interface and extends the HashMap class.
2. It contains unique elements.
3. It may have one null key and multiple null values.
4. It is non-synchronized.
5. It is the same as HashMap with an additional feature that maintains insertion order. For example, when we run the code with a HashMap, we get a different order of elements.

## C} TreeMap
1. Sorted Order: Entries in a TreeMap are sorted according to the natural ordering of its keys or by a comparator provided at map creation. This means that the keys are always kept in sorted order.
2. No Duplicate Keys: Like other map implementations, TreeMap does not allow duplicate keys. If you try to insert a key that already exists in the map, it will overwrite the existing value.
3. Null Keys: TreeMap does not allow null keys. Attempting to add a null key will result in a NullPointerException. However, null values are allowed.

