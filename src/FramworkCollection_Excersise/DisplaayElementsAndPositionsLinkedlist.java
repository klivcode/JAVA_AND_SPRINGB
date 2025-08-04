package FramworkCollection_Excersise;

import java.util.LinkedList;

public class DisplaayElementsAndPositionsLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        for(int i=0;i<colors1.size();i++){
            System.out.println("Position"+i+":"+colors1.get(i));

        }
    }
}
