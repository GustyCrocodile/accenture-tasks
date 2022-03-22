package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean a;
        boolean b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input value a: ");
        a = scan.nextBoolean();

        System.out.println("Input value b:");
        b = scan.nextBoolean();

        String result = "";

        result += "a == b? ";

        if ( a == b) {
            result += "true\n";
        } else {
            result += "false\n";
        }

        System.out.println(result);
    }
}

