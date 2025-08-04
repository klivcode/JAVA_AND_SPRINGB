package FramworkCollection_Excersise;

import java.util.TreeSet;

public class GetFirstAndLastElementTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors1= new TreeSet<>();
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Red");

        //Get First and Last Element

        System.out.println("First ELement"+colors1.first());
        System.out.println("Last ELement"+colors1.last());
    }
}
