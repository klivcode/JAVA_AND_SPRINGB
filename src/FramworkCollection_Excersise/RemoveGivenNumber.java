package FramworkCollection_Excersise;

import java.util.TreeSet;

public class RemoveGivenNumber {
    public static void main(String[] args) {
        TreeSet<Integer> colors1= new TreeSet<>();
        colors1.add(5);
        colors1.add(8);
        colors1.add(6);
        colors1.add(7);
        colors1.add(9);
        colors1.add(10);

        Integer givenNumber=5;
        //Remove the given Number
        colors1.remove(givenNumber);
        System.out.println(colors1);
    }
}
