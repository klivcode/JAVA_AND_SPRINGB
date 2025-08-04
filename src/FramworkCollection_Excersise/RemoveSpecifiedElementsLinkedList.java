package FramworkCollection_Excersise;

import java.util.LinkedList;

public class RemoveSpecifiedElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        System.out.println("Before removal"+colors1);
        colors1.remove("Blue");
        System.out.println("After removal"+colors1);
    }
}
