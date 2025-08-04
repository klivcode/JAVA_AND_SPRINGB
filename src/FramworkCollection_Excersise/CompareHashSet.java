package FramworkCollection_Excersise;

import java.util.HashSet;

public class CompareHashSet {

    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");


        HashSet<String> colors2= new HashSet<>();
        colors2.add("Green");
        colors2.add("Orange");

        //Compare Two HasSet using boolean equlas

        boolean areEql= colors1.equals(colors2);
        System.out.println(areEql);
    }
}
