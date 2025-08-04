package FramworkCollection_Excersise;

import java.util.LinkedList;

public class JoinTwoLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Blue");
        colors1.add("Red");

        LinkedList<String> colors2= new LinkedList<>();

        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        LinkedList<String> joinedLinkedlist= new LinkedList<>();
        joinedLinkedlist.addAll(colors1);
        joinedLinkedlist.addAll(colors2);

        System.out.println("Joined Linkedlist"+joinedLinkedlist);


    }
}
