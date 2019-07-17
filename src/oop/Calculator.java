package oop;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Calculator {

  public double addition(double a, double b) {
    double c;
    c = a + b;
    return c;
  }

  public int sub(int a, int b) {
    int c;
    c = a * b;
    return c;
  }

  public int mul(int a, int b) {
    int c;
    c = a * b;
    return c;
  }

  public int div(int a, int b) {
    int c;
    try{
      c = a / b;
    }catch (Exception e){
      System.out.println("An exception is rasied due to following operation");
    }
    return c;
  }
}