package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReseversList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("blue");
        arrayList.add("orange");

        // Using Collections.reverse()
        System.out.println("Default"+arrayList);
        Collections.reverse(arrayList);
        System.out.println("Reversed List"+arrayList);
    }
}
