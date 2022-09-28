import java.time.*;

public class Lab1 {
  public static void main(String[] args) {
    LocalDate currentDate = LocalDate.now();
    LocalDate lab1 = LocalDate.of(2022, 9, 28);
    LocalDate lab2 = LocalDate.of(2022, 10, 28);
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
  }
}
