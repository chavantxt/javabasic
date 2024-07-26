import java.util.ArrayList;

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
    public static void main(String[] args) {
        arrayListFunction();
      
    }
  }