package FramworkCollection_Excersise;

import java.util.HashSet;

public class SizeHashset {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        int size=colors1.size();
        System.out.println(size);
    }
}
