package FramworkCollection_Excersise;

import java.util.TreeSet;

public class CompareTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors1= new TreeSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        TreeSet<String> colors2= new TreeSet<>();
        colors2.add("Red");
        colors2.add("Blue");

        boolean arEqual=colors1.equals(colors2);
        System.out.println(arEqual);
    }
}
