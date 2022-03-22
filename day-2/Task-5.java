package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean a;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input value a: ");
        a = scan.nextBoolean();

        String result = "";

//        result += "Is a even? ";

        if ( a ) {
            result += "false\n";
        } else {
            result += "true\n";
        }

        System.out.println(result);
    }
}

