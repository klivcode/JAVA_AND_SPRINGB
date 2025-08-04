package FramworkCollection_Excersise;

import java.util.LinkedList;

public class FirstAndLastOccurenceIinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");


        String element="Red";
        int firstIndex= colors1.indexOf(element);
        int lastIndex= colors1.lastIndexOf(element);

        System.out.println("First occurence of "+element+" is "+firstIndex);
        System.out.println("Last occurence of "+element+" is "+lastIndex);
    }
}
