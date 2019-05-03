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

      Date myBirth;
      Date yourBirth;

  }
}
