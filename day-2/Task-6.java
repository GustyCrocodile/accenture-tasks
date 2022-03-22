package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input value a: ");
        a = scan.nextInt();

        System.out.println("Input value b:");
        b = scan.nextInt();

        boolean result = false;

        if ((a == b) || (a < 0 && b > 0) || (a > 101 && b > 101) ) {
            result = true;
        }

        System.out.println(result);
    }
}

