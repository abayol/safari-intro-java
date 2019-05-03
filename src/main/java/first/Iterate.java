package first;

public class Iterate {
  public static void main(String[] args) {
    int x = 99;
    while (x > 90) {
      System.out.println("x is: " + x + "... It's big");
      x = x - 1;
    }

    for (int y = 99; y > 90; y = y - 1) {
      System.out.println("Y is " + y);
    }
  }
}
