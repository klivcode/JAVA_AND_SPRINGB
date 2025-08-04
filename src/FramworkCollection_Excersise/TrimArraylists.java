package FramworkCollection_Excersise;

import java.util.ArrayList;

public class TrimArraylists {
    public static void main(String[] args) {
        ArrayList<String> colors1= new ArrayList<String>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Violet");


        System.out.println("Before triming"+colors1);
        colors1.trimToSize();
        System.out.println("After triming"+colors1);
    }
}
