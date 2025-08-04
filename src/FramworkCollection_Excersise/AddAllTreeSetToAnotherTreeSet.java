package FramworkCollection_Excersise;

import java.util.TreeSet;

public class AddAllTreeSetToAnotherTreeSet {

    public static void main(String[] args) {
        TreeSet<String> colors1= new TreeSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        TreeSet<String> colors2= new TreeSet<>();
        colors2.add("Green");
        colors2.add("Orange");

        colors2.addAll(colors1);
        System.out.println(colors2);
    }
}
