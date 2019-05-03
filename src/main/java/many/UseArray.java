package many;

import java.util.Scanner;

public class UseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers?");
    int numberCount = sc.nextInt();
    int[] numbers = new int[numberCount];

    for (int numSoFar = 0; numSoFar < numberCount; numSoFar++) {
      System.out.println("Enter number: ");
      int number = sc.nextInt();
      numbers[numSoFar] = number;
    }

    System.out.println("numbers are: " + numbers);

    int sum = 0;
    for (int x : numbers) {
      sum += x;
    }
    System.out.println("Sum is " + sum);
  }
}
