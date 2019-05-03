package first;

public class UseSwitch {
  public static void main(String[] args) {
    int x = 2;
    switch (x) { // switch on int, enum, String
      case 1: // exact matches, not "conditions"
      case 2:
      case 3:
        System.out.println("value is one, two, or three");
        break;
      case 100:
        System.out.println("value is 100");
        break;
      case 99:
        System.out.println("value is 99");
        break;
      default:
        System.out.println("something else");
    }
  }
}
