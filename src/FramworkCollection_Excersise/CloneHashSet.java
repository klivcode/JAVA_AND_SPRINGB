package FramworkCollection_Excersise;

import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        //Colne
        HashSet<String> colors2= new HashSet<>(colors1);
        System.out.println(colors2);

    }
}
