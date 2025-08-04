package FramworkCollection_Excersise;

import java.util.LinkedList;

public class SwapElementslinkedlist {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");
        System.out.println("Before swaping"+colors1);

        int index1=1;
        int index2=2;
        String temp=colors1.get(index1);
        colors1.set(index1,colors1.get(index2));
        colors1.set(index2,temp);
        System.out.println("After swaping"+colors1);
    }
}
