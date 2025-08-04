package FramworkCollection_Excersise;

import java.util.LinkedList;

public class TestEmptyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        //Test if empty
        System.out.println("Is Empty"+colors1.isEmpty());
        colors1.add("Green");
        System.out.println("Is Empty"+colors1);

    }
}
