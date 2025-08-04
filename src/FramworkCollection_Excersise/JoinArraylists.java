package FramworkCollection_Excersise;

import java.util.ArrayList;

public class JoinArraylists {
    public static void main(String[] args) {
        ArrayList<String>colors1= new ArrayList<>();
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
        colors2.add("crimson");
        ArrayList<String>joinedArraylist= new ArrayList<>();
        joinedArraylist.addAll(colors1);
        joinedArraylist.addAll(colors2);
        System.out.println(joinedArraylist);
    }
}
