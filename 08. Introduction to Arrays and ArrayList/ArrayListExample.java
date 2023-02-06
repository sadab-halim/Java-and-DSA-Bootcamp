import java.util.ArrayList;

public class ArrayListExample {
  public static void main (String[] args) {
    //syntax
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<>(10);
    ArrayList<String> list = new ArrayList<>();
    /*
    - Primitive Data Types are not allowed
    - Only Wrapper Classes are allowed
    */

    list.add(56);
    list.add(24);
    list.add(55);
    list.add(63);

    System.out.println(list);
    // returns either true or false
    System.out.println(list.contains(67));
    // modifying 0th index data with 99
    list.set(0, 99)
    // removing data from ArrayList
    list.remove(2);

    //taking input
    for(int i = 0; i < 5; i++){
      list.add(in.nextInt());
    }

    //get item at any index
    for(int i = 0; i < 5; i++){
      System.out.println(list.get(i));  //pass index here, list[index] will not work here

    System.out.println(list);
    }
  }
}