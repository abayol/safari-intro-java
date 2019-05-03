package datestuff;

public class Date {
  int day;
  int month;
  int year;

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
  }

  public static int daysInMonth(int month, int year) {
    switch (month) {
      case 9:
      case 4:
      case 6:
      case 11:
        return 30;
      case 2:
        if (isLeapYear(year)) {
          return 29;
        } else {
          return 28;
        }
      default:
        return 31; // not totally safe what if month were -3?
    }
  }

  // Zeller's congruence calculates day of week for day, month, year...
  // Saturday 0 ... Friday 6
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year -= 1;
    }
    return (day + (13 * (month + 1) / 5) + year + (year / 4)
        - (year / 100) + (year / 400)) % 7;
  }
  // Write a method to turn 0 -> 6 into text Saturday -> Friday

}
