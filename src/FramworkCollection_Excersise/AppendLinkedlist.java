package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppendLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        colors1.addLast("lolipop");
        System.out.println("After appending"+colors1);
    }
}
