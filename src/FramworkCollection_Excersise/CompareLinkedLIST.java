package FramworkCollection_Excersise;

import java.util.LinkedList;

public class CompareLinkedLIST {

    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Green");
        colors1.add("Orange");

        LinkedList<String> colors2= new LinkedList<>(colors1);
        boolean check=colors1.equals(colors2);
        System.out.println(check);
    }
}
