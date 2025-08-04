package FramworkCollection_Excersise;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        System.out.println("Before shuffling"+colors1);
        //Using Collections.shuffle()
        Collections.shuffle(colors1);
        System.out.println("After shuffling"+colors1);
    }
}
