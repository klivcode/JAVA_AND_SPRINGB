package FramworkCollection_Excersise;

import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors1= new ArrayList<String>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");

        ArrayList<String> colors2=new ArrayList<>();
        colors2.add("Blue");
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Orange");
        colors2.add("Violet");


        boolean areEqual=colors1.equals(colors2);
        System.out.println(areEqual);
    }
}
