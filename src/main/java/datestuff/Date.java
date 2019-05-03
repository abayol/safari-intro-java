package datestuff;

public class Date {
  private int day;
  private int month;
  private int year;

  // "constructor" better called initializer :)
  public  Date(int day, int m, int y) {
    if (day < 1 || day > daysInMonth(m, y)
        || m < 1 || m > 12) {
      // BAD DATE
      throw new IllegalArgumentException("Bad date: day=" + day
          + " month=" + m);
    }
    this.day = day;
    this.month = m;
    this.year = y;
//    day = d; // implicitly this.day
  }

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

  public static int dayOfWeek(Date d) {
    return dayOfWeek(d.day, d.month, d.year);
  }

  public int dayOfWeek() {
    return dayOfWeek(this.day, this.month, this.year);
  }

  public static Date tomorrow(Date d) {
    // WRONG!!! Should wrap end of month/ end of year!!!
    Date tomorrow = new Date(d.day + 1,d.month,d.year);
//    tomorrow.day = d.day + 1;
//    tomorrow.month = d.month;
//    tomorrow.year = d.year;
    return tomorrow;
  }

  public Date tomorrow() {
    // Take INTERNAL Responsibility for correctness (do this kind of
    // care in every method in this class)
    int tomorrowsTentativeDay = this.day + 1;
    int tomorrowsTentativeMonth = this.month;
    int tomorrowsTentativeYear = this.year;
    if (tomorrowsTentativeDay > daysInMonth(this.month, this.year)) {
      tomorrowsTentativeDay = 1;
      tomorrowsTentativeMonth++;
      if (tomorrowsTentativeMonth > 12) {
        tomorrowsTentativeMonth = 1;
        tomorrowsTentativeYear++;
      }
    }
    return new Date(
        tomorrowsTentativeDay,
        tomorrowsTentativeMonth,
        tomorrowsTentativeYear);
  }

  @Override
  public String toString() {
    return "Date: day=" + this.day
        + " month=" + this.month
        + " year=" + this.year;
  }
  // Write a method to turn 0 -> 6 into text Saturday -> Friday

}
