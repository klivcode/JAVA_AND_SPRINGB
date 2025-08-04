package FramworkCollection_Excersise;

import java.util.ArrayList;

public class ClearEmptyArraylists {

    public static void main(String[] args) {
        ArrayList<String> colors1= new ArrayList<>();
        colors1.add("Blue");
        colors1.add("Red");
        System.out.println("Before clearing"+colors1);
        colors1.clear();
        System.out.println("After clearing"+colors1);

    }
}
