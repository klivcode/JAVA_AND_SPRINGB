package FramworkCollection_Excersise;

import java.util.LinkedList;

public class RetriveFirstLinkedlistNotRemove {

    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");

        //Retrive but not remove
        String first=colors1.peekFirst();
        System.out.println(first);
    }
}
