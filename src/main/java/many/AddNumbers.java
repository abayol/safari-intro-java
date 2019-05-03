package many;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers?");
    int numberCount = sc.nextInt();
    List<Integer> allNumbers = new ArrayList<>();
    int numSoFar = 0;
    while (numSoFar < numberCount) {
      System.out.println("Enter number: ");
      int number = sc.nextInt();
      allNumbers.add(number); // automatic conversion int -> Integer
//      numSoFar = numSoFar + 1;
//      numSoFar += 1;
      numSoFar++; // ++numSoFar
    }

    System.out.println("Number list is: " + allNumbers);

//    int sum = 0;
//    for (int index = 0; index < allNumbers.size(); index++) {
//      sum = sum + allNumbers.get(index); // automatic conversion Integer -> int
//    }
//    System.out.println("sum is " + sum);

    int sum = 0;
    for (int x : allNumbers) { // works on any "Collection" and arrays
      sum += x; // add x to sum ...
    }
    System.out.println("Sum is " + sum);
  }
}
