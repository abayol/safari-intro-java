package many;

import java.util.ArrayList;
import java.util.List;

public class UseList {
  public static void main(String[] args) {
    // List is "conceptual" java feature called "interface"
    // Need a "concrete/real" implementation, a class called ArrayList
    List<String> names = new ArrayList<String>();
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");

    System.out.println("Number of names is " + names.size());
    System.out.println("First name in list is " + names.get(0));
    System.out.println("the list is: " + names);
    names.add(0, "Alice");
    System.out.println("First name in list is " + names.get(0));
    System.out.println("the list is: " + names);
  }
}
