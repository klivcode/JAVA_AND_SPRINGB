package FramworkCollection_Excersise;

import java.util.HashSet;

public class ConversionHashSetToArray {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        String[] colors2= colors1.toArray(new String[colors1.size()]);
        System.out.println(colors2);
    }
}
