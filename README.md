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
