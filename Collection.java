
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

  public static void arrayDequeFunction(){
  
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

  public static void main(String[] args) {
    // arrayListFunction();
    // linkedListFunction();
    //stackFunction();
    prirityQueue();

  }
}