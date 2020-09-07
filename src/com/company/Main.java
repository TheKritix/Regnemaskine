package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hvilken operation vil du bruge?");
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Gange");
        System.out.println("4. Dividere");
        Scanner input = new Scanner(System.in);
        int opValg = input.nextInt();
        if (opValg == 1) {
            System.out.println("Vælg første tal");
            Scanner input1 = new Scanner(System.in);
            double tal1 = input1.nextDouble();

            System.out.println("Vælg det anden tal");
            Scanner input2 = new Scanner(System.in);
            double tal2 = input2.nextDouble();

            System.out.println(tal1 + tal2);
        }
        else if (opValg == 2) {
            System.out.println("Vælg første tal");
            Scanner input1 = new Scanner(System.in);
            double tal1 = input1.nextDouble();

            System.out.println("Vælg det anden tal");
            Scanner input2 = new Scanner(System.in);
            double tal2 = input2.nextDouble();

            System.out.println(tal1 - tal2);
        }
        else if (opValg == 3) {
            System.out.println("Vælg første tal");
            Scanner input1 = new Scanner(System.in);
            double tal1 = input1.nextDouble();

            System.out.println("Vælg det anden tal");
            Scanner input2 = new Scanner(System.in);
            double tal2 = input2.nextDouble();

            System.out.println(tal1 * tal2);
        }
        else if (opValg == 4) {
            System.out.println("Vælg første tal");
            Scanner input1 = new Scanner(System.in);
            double tal1 = input1.nextDouble();

            System.out.println("Vælg det anden tal");
            Scanner input2 = new Scanner(System.in);
            double tal2 = input2.nextDouble();

            System.out.println(tal1 / tal2);
        }
        else if (opValg != 1 || opValg != 2 || opValg != 3 || opValg != 4) {
            System.out.println("Hov - Du kan kun vælge mellem 1 til 4");
        }

    }
}
