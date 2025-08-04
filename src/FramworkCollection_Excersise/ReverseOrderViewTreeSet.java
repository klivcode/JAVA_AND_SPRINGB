package FramworkCollection_Excersise;

import java.util.TreeSet;

public class ReverseOrderViewTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors1= new TreeSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        colors1.descendingSet();
        System.out.println(colors1);
    }
}
