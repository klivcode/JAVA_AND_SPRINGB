package FramworkCollection_Excersise;

import java.util.HashSet;

public class RemoveAllHashSetElement {
    public static void main(String[] args) {
        HashSet<String> colors1= new HashSet<>();
        colors1.add("Green");
        colors1.add("Orange");

        colors1.clear();
        System.out.println(colors1);
    }
}
