package FramworkCollection_Excersise;

import java.util.HashSet;
import java.util.LinkedList;

public class AppendElementInHashSet {

    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        //append the element

        colors1.add("Red");
        System.out.println(colors1);

    }
}
