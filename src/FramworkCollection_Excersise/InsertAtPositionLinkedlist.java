package FramworkCollection_Excersise;

import java.util.LinkedList;

public class InsertAtPositionLinkedlist {

    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        System.out.println("Before Insertion"+colors1);

        colors1.add(0,"Blue");
        colors1.add(1,"Red");
        colors1.add(2,"Green");
        colors1.add(3,"Orange");
        colors1.add(4,"Violet");
        System.out.println("After Insertion"+colors1);
    }
}
