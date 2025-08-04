package FramworkCollection_Excersise;

import java.util.TreeSet;

public class IterateTreeSet {

    public static void main(String[] args) {
        TreeSet<String> colors1= new TreeSet<>();
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Red");
        System.out.println(colors1);

        // Iterate

        for(String color:colors1)
        {
            System.out.println(color);
        }
    }
}
