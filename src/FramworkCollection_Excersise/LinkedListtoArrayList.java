package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListtoArrayList {
    public static void main(String[] args) {
        LinkedList<String> colors1= new LinkedList<>();
        colors1.add("Green");
        colors1.add("Orange");

        ArrayList<String> colors2= new ArrayList<String>(colors1);

        System.out.println(colors2);

    }
}
