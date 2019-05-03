package datestuff;

public class UseDate {
  public static void main(String[] args) {
    boolean twoKIsLeap = Date.isLeapYear(2000);
    System.out.println("2000 is leap year? " + twoKIsLeap);
    System.out.println("1900 is leap year? " + Date.isLeapYear(1900));
    System.out.println("2001 is leap year? " + Date.isLeapYear(2001));

    System.out.println("Days in Feb 2000: " + Date.daysInMonth(2, 2000));
    System.out.println("Days in Dec 2001: " + Date.daysInMonth(12, 2001));

    System.out.println("Day of Jan 1 2000 was " + Date.dayOfWeek(1, 1, 2000));

//    int myBirthDay = 3;
//    int myBirthMonth = 12;
//    int myBirthYear = 1980;
//
//    int yourBirthDay = 15;
//    int yourBirthMonth = 1;
//    int yourBirthYear = 1988;

    Date myBirth = new Date(3, 12, 1980);
//      myBirth.day = 3;
//      myBirth.month = 12;
//      myBirth.year = 1980;

    System.out.println("My birthday is on day number "
        + Date.dayOfWeek(myBirth));
    System.out.println("Day after my birthday is on " +
        Date.dayOfWeek(Date.tomorrow(myBirth)));

    Date yourBirth = new Date(15, 1, 1988);
    System.out.println("your birthday is on " + Date.dayOfWeek(yourBirth));

    // --------------------------------------------------------

    System.out.println("My birthday is on day number "
        + myBirth.dayOfWeek());
    System.out.println("Day after my birthday is on " +
        myBirth.tomorrow().dayOfWeek());

//    myBirth.day = 99;
    // myBirth.day++;
//    myBirth.month = 30;
//    sendInvoice(myBirth);

    System.out.println("your birthday is on " + Date.dayOfWeek(yourBirth));

    try {
      Date d = new Date(1, 13, 2000); // bad!!!
      System.out.println("d is " + d/*.toString()*/);
    } catch (IllegalArgumentException ex) {
      System.out.println("OOops, that was a bad date. Message is "
          + ex.getMessage());
    }
    System.out.println("Carry on chaps..");
  }
}
