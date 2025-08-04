package FramworkCollection_Excersise;

import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");


        System.out.println("Before removing"+colors);
        colors.remove(2);// index 2 element third 0 1 2
        System.out.println("After removing"+colors);
    }
}
