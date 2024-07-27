
import java.util.*;

public class Collection {

  public static void arrayListFunction() {

    // --------------Array List-------------------
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Print whole array
    for (String i : cars) {
      System.out.println(i);
    }

    // Print fist ţ array index
    System.out.println("Printing first Index : " + cars.get(0));

    // Set Opel at first index
    cars.set(0, "Opel");

    System.out.println("Array After removal first index : ");

    // Remove first index
    cars.remove(0);
    for (String i : cars) {
      System.out.println(i);
    }

    // Array Size
    System.out.println("Array Size : " + cars.size());

  }

  public static void linkedListFunction() {

    LinkedList<String> list = new LinkedList<String>();

    // Adding elements to the LinkedList using add() method
    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    list.add("Five");

    // Printing the LinkedList
    System.out.println(list);

    list.remove("B");
    list.remove(3);
    list.removeFirst();
    list.removeLast();

    System.out.println(list);

    list.size();
    list.getFirst();
    list.getLast();
  }

  public static void stackFunction() {
    Stack<Integer> stack = new Stack<>();

    // Push elements onto the stack
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    Integer pos = (Integer) stack.search(3);

    if (pos == -1)
      System.out.println("Element not found");
    else
      System.out.println("Element is found at position: " + pos);

    Integer element = (Integer) stack.peek();
    System.out.println("Element on stack top: " + element);

    // Pop elements from the stack
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }

  public static void prirityQueue() {

    PriorityQueue<String> queue = new PriorityQueue<String>();
    queue.add("Amit Sharma");
    queue.add("Vijay Raj");
    queue.add("JaiShankar");
    queue.add("Raj");
    System.out.println("head:" + queue.element());
    System.out.println("head:" + queue.peek());
    System.out.println("iterating the queue elements:");
    Iterator itr = queue.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    queue.remove();
    queue.poll();
    System.out.println("after removing two elements:");
    Iterator<String> itr2 = queue.iterator();
    while (itr2.hasNext()) {
      System.out.println(itr2.next());
    }
  }

  public static void arrayDequeFunction() {

    ArrayDeque<Integer> deque = new ArrayDeque<>();

    // Add elements to the back
    deque.addLast(1);
    deque.addLast(2);

    // Add elements to the front
    deque.addFirst(0);

    // Remove elements from the front
    System.out.println(deque.removeFirst()); // Output: 0

    // Remove elements from the back
    System.out.println(deque.removeLast()); // Output: 2

    // Peek at the front
    System.out.println(deque.peekFirst()); // Output: 1

    // Peek at the back
    System.out.println(deque.peekLast()); // Output: 1
  }

  public static void hashSetFunction() {
    HashSet<String> set = new HashSet<String>();
    set.add("Ravi");
    set.add("Vijay");
    set.add("Ravi");
    set.add("Ajay");
    // Traversing elements
    Iterator<String> itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

  public static void LinkedhashSetFunction() {
    LinkedHashSet<String> set = new LinkedHashSet<String>();
    set.add("Ravi");
    set.add("Vijay");
    set.add("Ravi");
    set.add("Ajay");
    Iterator<String> itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

  public static void treeSetFunction() {
    TreeSet<String> set = new TreeSet<String>();
    set.add("Ravi");
    set.add("Vijay");
    set.add("Ravi");
    set.add("Ajay");
    // traversing elements
    Iterator<String> itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

  public static void hashMapFunction(){
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    capitalCities.get("England");
    capitalCities.remove("England");
    capitalCities.clear();
    capitalCities.size();

  }

  public static void LinkedhashMapFunction(){
    LinkedHashMap<String, String> lhm
            = new LinkedHashMap<String, String>();

        // Adding entries in Map
        // using put() method
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "www.geeksforgeeks.org");

        // Printing all entries inside Map
        System.out.println(lhm);

        // Note: It prints the elements in same order
        // as they were inserted

        // Getting and printing value for a specific key
        System.out.println("Getting value for key 'one': "
                           + lhm.get("one"));

        // Getting size of Map using size() method
        System.out.println("Size of the map: "
                           + lhm.size());

        // Checking whether Map is empty or not
        System.out.println("Is map empty? "
                           + lhm.isEmpty());

        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? "
                           + lhm.containsKey("two"));

        // Using containsKey() method to check for a value
        System.out.println(
            "Contains value 'practice.geeks"
            + "forgeeks.org'? "
            + lhm.containsValue("practice"
                                + ".geeksforgeeks.org"));

        // Removing entry using remove() method
        System.out.println("delete element 'one': "
                           + lhm.remove("one"));

        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                           + lhm);
  }

  public static void treeMapFunction(){
    
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1); // O(log n)
        treeMap.put("C", 3); // O(log n)
        treeMap.put("B", 2); // O(log n)

        // Getting values from the tree map
        int valueA = treeMap.get("A"); // O(log n)
        System.out.println("Value of A: " + valueA);

        // Removing elements from the tree map
        treeMap.remove("B"); // O(log n)

        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) { // O(n)
            System.out.println(
                "Key: " + key + ", Value: "
                + treeMap.get(key)); // O(log n) for each
                                     // get operation
        }
  }

  public static void main(String[] args) {
    // arrayListFunction();
    // linkedListFunction();
    // stackFunction();
    // prirityQueue();

  }
}