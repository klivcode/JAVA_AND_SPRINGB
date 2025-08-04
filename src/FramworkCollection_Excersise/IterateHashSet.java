package FramworkCollection_Excersise;

import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        for(String color:colors1)
        {
            System.out.println(color);
        }
    }

}
