package FramworkCollection_Excersise;

import java.util.HashSet;
import java.util.TreeSet;

public class ConversionHashSetToTreeSet {

    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        //Convert HashSet to TreeSet

        TreeSet<String> colors2= new TreeSet<>(colors1);
        System.out.println(colors2);
    }
}
