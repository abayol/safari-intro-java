package first;

// import java.lang; implicit... (that's where String lives :)
import java.util.Scanner;

public class Selections {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int numOne = sc.nextInt(); // read just a number
    sc.nextLine();
    System.out.println("Enter another number");
    int numTwo = sc.nextInt();
    sc.nextLine();
    if (numOne > numTwo) {
      System.out.println("the first number was bigger");
    } else {
      System.out.println("the second number was bigger (or the same)");
    }
  }
}
