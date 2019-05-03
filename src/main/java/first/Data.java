package first;

public class Data {
  public static void main(String[] args) {
    // 8 "primitive" and classes "reference" types
    int x; // declaration . int range +/- 2 billion
    x = 99;
//    x = 3.141;
    double pi = 3.141; // "double" precision floating point (handles decimals)

    pi = x; // int fits in a double

    // represent text
    String s = "Hello";

    x = x + 1;

    System.out.println("The value of x is " + x);
    System.out.println("the string is " + s);

    int a = 99;
    int b = 3;
    // operators
    int c = a * b; // + - * / %
    // comparisons == (equality --of primitives!!!) != (inequality)
    // > < >= <=

    boolean isEqual = b == 3;
    System.out.println("does 3 equal 3 " + isEqual);
    isEqual = a == b;
    System.out.println("does a equal b " + isEqual);

    // boolean operators && and || or
    System.out.println("test: " + (( 3 > 2 ) || ( 5 > 7 )));
  }
}
