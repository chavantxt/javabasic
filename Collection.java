import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Collection {

    public static void arrayListFunction(){
        
    //--------------Array List-------------------
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    //Print whole array
    for (String i : cars) {
      System.out.println(i);
    }

    //Print fist ţ array index
    System.out.println("Printing first Index : "+cars.get(0));
    
    //Set Opel at first index
    cars.set(0, "Opel");

    System.out.println("Array After removal first index : ");
    
    //Remove first index
    cars.remove(0);
    for (String i : cars) {
        System.out.println(i);
      }

      //Array Size
      System.out.println("Array Size : "+cars.size());

    }

    public static void linkedListFunction(){

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

    public static void stackFunction(){
       Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Integer pos = (Integer) stack.search(3);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);

        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);

        // Pop elements from the stack
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
       // arrayListFunction();
       // linkedListFunction();
        stackFunction();
      
    }
  }