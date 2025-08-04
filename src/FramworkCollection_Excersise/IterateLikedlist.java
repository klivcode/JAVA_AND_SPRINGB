package FramworkCollection_Excersise;

import java.util.LinkedList;

public class IterateLikedlist {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");
        // Uisng Enhanced for loop
        for (String color:colors1)
        {
            System.out.println(color);
        }
    }
}
