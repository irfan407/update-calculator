package oop;

import java.util.Scanner;

public class MainDriver {

  public static void main(String[] args) {

    double firstNumber, secondNumber;
    int operation;

    Scanner in = new Scanner(System.in);

    System.out.println("Enter first num");
    firstNumber = in.nextInt();
    System.out.println("Enter second num");
    secondNumber = in.nextInt();

    System.out.println("Enter 1 for additon ");
    System.out.println("Enter 2 for subtraction ");
    System.out.println("Enter 3 for mul ");
    System.out.println("Enter 4 for div ");
    System.out.println("Enter 5 for power ");
    System.out.println("Enter 6 for square ");

    operation = in.nextInt();

    Calculator aCalculator;
    if (operation >= 5) {
      aCalculator = new ScientificCalculator();
    } else {
      aCalculator = new Calculator();
    }

    try {
      switch (operation) {

        case 1:
          aCalculator.addition(a, b);
          break;
        case 2:
          aCalculator.sub(a, b);
          break;
        case 3:
          aCalculator.mul(a, b);
          break;
        case 4:
          aCalculator.div(a, b);
          break;
        case 5:
          aCalculator.power(a, b);
          break;
        case 6:
          aCalculator.square(a, b);
          break;
      }
    } catch (Exception expection) {
      System.out.println(expection);
    }
  }
}
