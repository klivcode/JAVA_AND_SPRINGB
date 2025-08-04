package FramworkCollection_Excersise;

import java.util.HashSet;
import java.util.LinkedList;

public class ConversionHashSetToList {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        LinkedList<String> colors2= new LinkedList<>(colors1);
        System.out.println(colors2);
    }
}
