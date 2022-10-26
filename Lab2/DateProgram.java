import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class DateProgram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int date1;
    int date2;

    LocalDate d1 = null;
    LocalDate d2 = null;

    LocalDate currentDate = LocalDate.now();
    LocalDate lab1 = LocalDate.of(2022, 9, 28);
    LocalDate lab2 = LocalDate.of(2022, 10, 26);
    LocalDate lab3 = LocalDate.of(2022, 11, 23);
    LocalDate lab4 = LocalDate.of(2022, 12, 7);


    System.out.println("Today's date: " + currentDate + "\n");

    System.out.print("Lab 1's due date is " + lab1);
    if ((lab1.getDayOfYear() - currentDate.getDayOfYear()) == 0) {
      System.out.println(" | Lab 1 is due today. \n");
    } else if ((lab1.getDayOfYear() - currentDate.getDayOfYear()) == 1) {
        System.out.println(" | Lab 1 is due tomorrow. \n");
    } else {
        System.out.println(" | Lab 1 is due in " + (lab1.getDayOfYear() - currentDate.getDayOfYear()) + " days. \n");
    }

    System.out.print("Lab 2's due date is " + lab2);
    if ((lab2.getDayOfYear() - currentDate.getDayOfYear()) == 0) {
      System.out.println(" | Lab 2 is due today. \n");
    } else if ((lab2.getDayOfYear() - currentDate.getDayOfYear()) == 1) {
        System.out.println(" | Lab 2 is due tomorrow. \n");
    } else {
        System.out.println(" | Lab 2 is due in " + (lab2.getDayOfYear() - currentDate.getDayOfYear()) + " days. \n");
    }

    System.out.print("Lab 3's due date is " + lab3);
    if ((lab3.getDayOfYear() - currentDate.getDayOfYear()) == 0) {
      System.out.println(" | Lab 3 is due today. \n");
    } else if ((lab3.getDayOfYear() - currentDate.getDayOfYear()) == 1) {
        System.out.println(" | Lab 3 is due tomorrow. \n");
    } else {
        System.out.println(" | Lab 3 is due in " + (lab3.getDayOfYear() - currentDate.getDayOfYear()) + " days. \n");
    }

    System.out.print("Lab 4's due date is " + lab4);
    if ((lab4.getDayOfYear() - currentDate.getDayOfYear()) == 0) {
      System.out.println(" | Lab 4 is due today. \n");
    } else if ((lab4.getDayOfYear() - currentDate.getDayOfYear()) == 1) {
        System.out.println(" | Lab 4 is due tomorrow. \n");
    } else {
        System.out.println(" | Lab 4 is due in " + (lab4.getDayOfYear() - currentDate.getDayOfYear()) + " days. \n");
    }

    boolean open = true;

    System.out.println("1. Lab 1");
    System.out.println("2. Lab 2");
    System.out.println("3. Lab 3");
    System.out.println("4. Lab 4");
    System.out.println("5. Custom date");
    System.out.println("0. Exit");

    System.out.println("\nEnter two dates from above or a custom date\n");

    while (open == true) {
        System.out.println("Select first date");
        date1 = sc.nextInt();

        if (date1 == 1) {
            d1 = lab1;
        } else if (date1 == 2) {
            d1 = lab2;
        } else if (date1 == 3) {
            d1 = lab3;
        } else if (date1 == 4) {
            d1 = lab4;
        } else if (date1 == 5) {
          try {
          System.out.println("Enter month (MM)");
          int year = sc.nextInt();
          System.out.println("Enter day (DD)");
          int month = sc.nextInt();
          System.out.println("Enter year (YYYY)");
          int day = sc.nextInt();
          d1 = LocalDate.of(year, month, day);
          } catch (Exception e) {
            System.out.println("\nYou entered an invalid date");
          }
        } else if (date1 == 0) {
          break;
        }

        System.out.println("Select second date");
        date2 = sc.nextInt();

        if (date2 == 1) {
            d2 = lab1;
        } else if (date2 == 2) {
            d2 = lab2;
        } else if (date2 == 3) {
            d2 = lab3;
        } else if (date2 == 4) {
            d2 = lab4;
        } else if (date2 == 5) {
          try {
          System.out.println("Enter month (MM)");
          int year = sc.nextInt();
          System.out.println("Enter day (DD)");
          int month = sc.nextInt();
          System.out.println("Enter year (YYYY)");
          int day = sc.nextInt();
          d2 = LocalDate.of(year, month, day);
          } catch (Exception e) {
            System.out.println("\nYou entered an invalid date");
        }
      } else if (date1 == 0) {
        break;
    }

   }

      System.out.println("\n" + d1);
      System.out.println(d2);

      System.out.println("\nThe number of days between these two dates: " + DateComparison(d1, d2));
    }



    static int DateComparison(LocalDate d1, LocalDate d2) {
      if (d1 != null && d2 != null) {
        return Math.abs(d1.getDayOfYear() - d2.getDayOfYear());
      }
      return 0;
    }
  }
