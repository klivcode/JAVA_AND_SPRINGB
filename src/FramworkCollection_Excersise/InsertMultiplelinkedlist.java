package FramworkCollection_Excersise;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertMultiplelinkedlist {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        System.out.println("Before insertion"+colors1);
        LinkedList<String> colors2= new LinkedList<>(Arrays.asList("Yellow","Blue","Red","Green","Orange","Violet"));
        colors1.addAll(1,colors2);;
        System.out.println("After insertion"+colors1);
    }
}
