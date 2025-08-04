package FramworkCollection_Excersise;

import java.util.HashSet;

public class TestHashSetEmptyOrNot {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        System.out.println("Is Empty"+colors1.isEmpty());


        // add element

        colors1.add("red");
        System.out.println("Is Hash Empty"+colors1.isEmpty());
    }
}
