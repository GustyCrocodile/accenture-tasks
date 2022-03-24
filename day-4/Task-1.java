package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] colr = {"Blue", "Yellow", "Green", "Red", "Black", "White", "Purlple"};

        ArrayList<String> colors = new ArrayList<String>();

        for (String color : colr) {
            colors.add(color);
        }

        colors.remove(2);
        colors.add(colors.size(),"Beige");
        colors.add(0, "Grey");

        for (int i = 0; i < colors.size(); i++ ) {
            System.out.println(colors.get(i));
        }
        System.out.println("\n");

        List<String> colorsSublist = colors.subList(2, 5);

        for (int i = 0; i < colorsSublist.size(); i++ ) {
            System.out.println(colorsSublist.get(i));
        }
    }
}

