package oop;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Calcu {
    public static void main(String[] args) {

        int a, b, c, select;
        double d;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter first num");
        a = in.nextInt();
        System.out.println("Enter second num");
        b = in.nextInt();

        System.out.println("Enter 1 for add ");
        System.out.println("Enter 2 for sub ");
        System.out.println("Enter 3 for mul ");
        System.out.println("Enter 4 for div ");
        System.out.println("Enter 5 for power ");
        System.out.println("Enter 6 for square ");

        select = in.nextInt();


        Lator irfan = new Lator();


        switch (select) {

            case 1:
                try {
                    irfan.add(a, b);


                } catch (Exception expection) {
                    System.out.println(expection);

                }
                break;
            case 2:
                try {
                    irfan.sub(a, b);

                } catch (Exception expection) {
                    System.out.println(expection);

                }
                break;
            case 3:
                try {
                    irfan.mul(a, b);

                } catch (Exception expection) {
                    System.out.println(expection);

                }
                break;
            case 4:
                try {
                    irfan.div(a, b);

                } catch (Exception expection) {
                    System.out.println(expection);

                }
            case 5:
                try {
                    irfan.div(a, b);

                    irfan.power(a, b);


                } catch (Exception expection) {
                    System.out.println(expection);

                }
            case 6:
                try {
                    irfan.div(a, b);

                    irfan.square(a, b);


                } catch (Exception expection) {
                    System.out.println(expection);


                }


        }
    }}