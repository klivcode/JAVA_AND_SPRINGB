package FramworkCollection_Excersise;

import java.util.HashSet;

public class RetainCommonHashSets {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        HashSet<String> colors2= new HashSet<>();
        colors2.add("Green");
        colors2.add("Orange");
        colors2.add("Red");

        //Retain common one
        colors2.retainAll(colors1);
        System.out.println(colors2);
    }
}
