package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input value a: ");
        a = scan.nextInt();

        String result = "";

        result += "Is a even? ";

        if ( (a % 2) != 0 ) {
            result += "true\n";
        } else {
            result += "false\n";
        }

        System.out.println(result);
    }
}

