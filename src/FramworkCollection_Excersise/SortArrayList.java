package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");

        // Using Collections.sort

        System.out.println("Before sorting"+colors);
        Collections.sort(colors);
        System.out.println("After sorting"+colors);
    }
}
