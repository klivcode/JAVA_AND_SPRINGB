package FramworkCollection_Excersise;

import java.util.LinkedList;

public class RemoveFirstLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");
        String colors2 = colors1.removeFirst();
        System.out.println("After removing"+colors2);

    }
}
